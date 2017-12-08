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

import org.deeplearning4j.nn.api.Model;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.util.ModelSerializer;
import org.deeplearning4j.zoo.PretrainedType;
import org.deeplearning4j.zoo.ZooModel;
import org.deeplearning4j.zoo.model.VGG16;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautil.err.ReturnErrorImpl;

public final class VGG16Configs
{
  private VGG16Configs()
  {
  }

  public static ReturnError saveToFile(File file)
  {
    try {
      final ZooModel vgg16ZooModel = new VGG16();
      final Model vgg16Model = vgg16ZooModel.initPretrained(PretrainedType.IMAGENET);
      ModelSerializer.writeModel(vgg16Model, file, false);
      return null;
    } catch (IOException e) {
      final String message = String.format("Failed to retrieve the model weights: %s", e.getMessage());
      return new ReturnErrorImpl(message);
    }
  }

  public static Pair<ComputationGraph, ReturnError> loadFromCode()
  {
    try {
      final ZooModel vgg16ZooModel = new VGG16();
      final ComputationGraph vgg16Model = (ComputationGraph)vgg16ZooModel.initPretrained(PretrainedType.IMAGENET);
      return Pair.of(vgg16Model, null);
    } catch (IOException e) {
      final String message = String.format("Error creating model: %s", e.getMessage());
      return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
    }
  }

  public static Pair<ComputationGraph, ReturnError> loadFromFile(File file)
  {
    try {
      final ComputationGraph cg = ModelSerializer.restoreComputationGraph(file, false);
      return Pair.of(cg, null);
    } catch (IOException e) {
      final String message = String.format("Failed to load the model weights: %s", e.getMessage());
      return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
    }
  }
}
