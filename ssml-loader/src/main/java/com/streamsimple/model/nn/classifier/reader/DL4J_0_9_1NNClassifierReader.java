/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier.reader;

import com.simplifi.it.javautil.err.ReturnError;
import com.simplifi.it.javautil.err.ReturnErrorImpl;
import com.streamsimple.model.nn.ComputationGraphModel;
import com.streamsimple.model.nn.Model;
import com.streamsimple.model.nn.classifier.ClassifierModel;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.lang3.tuple.Pair;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.deeplearning4j.util.ModelSerializer;

public class DL4J_0_9_1NNClassifierReader implements Model.Reader
{
  @Override
  public Pair<Model, ReturnError> read(final ClassifierModel.Type classifierType, final InputStream inputStream)
  {
    try {
      final ComputationGraph cg = ModelSerializer.restoreComputationGraph(inputStream);
      return Pair.of((Model)new ComputationGraphModel(cg), null);
    } catch (IOException e) {
      final String message = String.format("Error loading model: %s", e.getMessage());
      return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
    }
  }
}
