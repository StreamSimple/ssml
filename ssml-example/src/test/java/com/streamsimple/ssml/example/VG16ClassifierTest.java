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
import java.util.List;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.guava.common.collect.Lists;
import com.streamsimple.javautil.err.ReturnError;

@Ignore
public class VG16ClassifierTest
{
  private static final Logger logger = LoggerFactory.getLogger(VG16ClassifierTest.class);

  @Test
  public void classifierTest()
  {
    List<String> filePaths = Lists.newArrayList(
        "/Users/tfarkas/Desktop/Pack-of-wolves.jpg" //List paths here
    );

    final Pair<ComputationGraph, ReturnError> result = VGG16Configs.loadFromCode();
    final ComputationGraph cg = result.getLeft();
    final ReturnError err = result.getRight();

    Assert.assertNull(err);
    Assert.assertNotNull(cg);

    for (String filePath: filePaths) {
      final Pair<String, ReturnError> predictionResult = VGG16Classifier.predictions(cg, new File(filePath));
      final String predictionString = predictionResult.getLeft();
      final ReturnError predictionErr = predictionResult.getRight();

      if (predictionErr != null) {
        Assert.fail(predictionErr.getMessage());
      }

      logger.info("Prediction for {}:\n{}", filePath, predictionString);
    }
  }
}
