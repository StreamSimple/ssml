/*
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn.classifier.reader;

import java.io.IOException;
import java.io.InputStream;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.util.ModelSerializer;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautil.err.ReturnErrorImpl;
import com.streamsimple.model.nn.classifier.ClassifierModel;
import com.streamsimple.model.nn.classifier.ComputationGraphClassifierModel;

public class DL4J_0_9_1NNClassifierReader implements ClassifierModel.Reader
{
  @Override
  public Pair<ClassifierModel, ReturnError> read(final InputStream inputStream)
  {
    try {
      final ComputationGraph cg = ModelSerializer.restoreComputationGraph(inputStream);
      return Pair.of((ClassifierModel)new ComputationGraphClassifierModel(cg), null);
    } catch (IOException e) {
      final String message = String.format("Error loading model: %s", e.getMessage());
      return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
    }
  }
}
