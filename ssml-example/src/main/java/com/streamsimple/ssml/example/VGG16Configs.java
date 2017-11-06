/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.ssml.example;

import com.simplifi.it.javautil.err.ReturnError;
import com.simplifi.it.javautil.err.ReturnErrorImpl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.tuple.Pair;
import org.deeplearning4j.nn.api.Model;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.util.ModelSerializer;
import org.deeplearning4j.zoo.PretrainedType;
import org.deeplearning4j.zoo.ZooModel;
import org.deeplearning4j.zoo.model.VGG16;

public class VGG16Configs
{
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
