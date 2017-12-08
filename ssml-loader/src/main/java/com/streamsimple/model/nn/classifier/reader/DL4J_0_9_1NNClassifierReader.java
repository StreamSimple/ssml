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
