/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsimple.ssml.example;

import java.io.File;
import java.io.IOException;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.nn.modelimport.keras.trainedmodels.TrainedModels;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.preprocessor.DataNormalization;
import org.nd4j.linalg.dataset.api.preprocessor.VGG16ImagePreProcessor;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.deeplearning4j.org.datavec.image.loader.NativeImageLoader;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautil.err.ReturnErrorImpl;

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
