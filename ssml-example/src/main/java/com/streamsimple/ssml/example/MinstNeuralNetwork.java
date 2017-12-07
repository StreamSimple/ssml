/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.ssml.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.tuple.Triple;
import org.deeplearning4j.datasets.iterator.impl.MnistDataSetIterator;
import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.Updater;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.weights.WeightInit;
import org.deeplearning4j.optimize.api.IterationListener;
import org.deeplearning4j.optimize.listeners.ScoreIterationListener;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.SplitTestAndTrain;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.lossfunctions.LossFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Most of the code copied from dl4j-example MNISTAnomalyExample.
 */
public class MinstNeuralNetwork
{
  private static final Logger logger = LoggerFactory.getLogger(MinstNeuralNetwork.class);

  public static Triple<List<INDArray>, List<INDArray>, List<INDArray>> testSplit() throws IOException
  {
    //Load data and split into training and testing sets. 40000 train, 10000 test
    DataSetIterator iter = new MnistDataSetIterator(100,50000,false);

    List<INDArray> featuresTrain = new ArrayList<>();
    List<INDArray> featuresTest = new ArrayList<>();
    List<INDArray> labelsTest = new ArrayList<>();

    Random r = new Random(12345);

    while (iter.hasNext()) {
      DataSet ds = iter.next();
      SplitTestAndTrain split = ds.splitTestAndTrain(80, r);  //80/20 split (from miniBatch = 100)
      featuresTrain.add(split.getTrain().getFeatureMatrix());
      DataSet dsTest = split.getTest();
      featuresTest.add(dsTest.getFeatureMatrix());
      INDArray indexes = Nd4j.argMax(dsTest.getLabels(),1); //Convert from one-hot representation -> index
      labelsTest.add(indexes);
    }

    return Triple.of(featuresTrain, featuresTest, labelsTest);
  }

  public static MultiLayerNetwork trainMinstNetwork(List<INDArray> trainingDatas)
  {
    //Set up network. 784 in/out (as MNIST images are 28x28).
    //784 -> 250 -> 10 -> 250 -> 784
    MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
        .seed(12345)
        .iterations(1)
        .weightInit(WeightInit.XAVIER)
        .updater(Updater.ADAGRAD)
        .activation(Activation.RELU)
        .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
        .learningRate(0.05)
        .regularization(true).l2(0.0001)
        .list()
        .layer(0, new DenseLayer.Builder().nIn(784).nOut(250).build())
        .layer(1, new DenseLayer.Builder().nIn(250).nOut(10).build())
        .layer(2, new DenseLayer.Builder().nIn(10).nOut(250).build())
        .layer(3, new OutputLayer.Builder().nIn(250).nOut(784)
        .lossFunction(LossFunctions.LossFunction.MSE)
        .build())
        .pretrain(false)
        .backprop(true)
        .build();

    MultiLayerNetwork net = new MultiLayerNetwork(conf);
    net.setListeners(Collections.singletonList((IterationListener)new ScoreIterationListener(1)));

    //Train model:
    int nEpochs = 30;
    for (int epoch = 0; epoch < nEpochs; epoch++) {
      for (INDArray trainingData: trainingDatas) {
        net.fit(trainingData, trainingData);
      }

      logger.info("Epoch {} complete", epoch);
    }

    return net;
  }
}
