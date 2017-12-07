/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.ssml.example;

import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautil.err.ReturnErrorImpl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.tuple.Pair;
import org.datavec.image.loader.NativeImageLoader;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.nn.modelimport.keras.trainedmodels.TrainedModels;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.preprocessor.DataNormalization;
import org.nd4j.linalg.dataset.api.preprocessor.VGG16ImagePreProcessor;

public final class VGG16Classifier
{
  private VGG16Classifier()
  {
  }

  public static Pair<String, ReturnError> predictions(final ComputationGraph vgg16Model, final File imageFile)
  {
    final NativeImageLoader loader = new NativeImageLoader(224, 224, 3);
    final INDArray image;

    try {
      image = loader.asMatrix(imageFile);
    } catch (IOException e) {
      final String message = String.format("Error loading image in %s:\n%s",
          imageFile.getAbsolutePath(), e.getMessage());
      return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
    }

    // Mean subtraction pre-processing step for VGG
    final DataNormalization scaler = new VGG16ImagePreProcessor();
    scaler.transform(image);

    final INDArray[] output = vgg16Model.output(false, image);
    final String predictions = TrainedModels.VGG16.decodePredictions(output[0]);
    return Pair.of(predictions, null);
  }
}
