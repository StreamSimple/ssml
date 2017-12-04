/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.ssml.example;

import com.google.common.collect.Lists;
import com.streamsimple.javautil.err.ReturnError;

import java.io.File;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
