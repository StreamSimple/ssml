/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config;

import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautils.testutils.ResourceUtils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;
import org.junit.Test;

public class TestPmmlConfig
{
  @Test
  public void malformedXmlFail()
  {
    verifyFailure(Paths.get("pmmlconfigs", "invalid", "malformed.xml"));
  }

  @Test
  public void noPmmlTagFail()
  {
    verifyFailure(Paths.get("pmmlconfigs", "invalid", "noPMMLTag.xml"));
  }

  @Test
  public void noVersionAttributeFail()
  {
    verifyFailure(Paths.get("pmmlconfigs", "invalid", "noVersionAttribute.xml"));
  }

  @Test
  public void olderVersionFail() throws Exception
  {
    verifyFailure(Paths.get("pmmlconfigs", "v3v2", "valid", "neuralNetwork.xml"));
  }

  @Test
  public void schemaViolationFail()
  {
    verifyFailure(Paths.get("pmmlconfigs", "invalid", "schemaViolation.xml"));
  }

  @Test
  public void loadValidXml()
  {
    final Path resourcePath = Paths.get("pmmlconfigs", "v4v3", "valid", "bayesianNetwork.xml");
    final File pmmlFile = ResourceUtils.getResourceAsFile(resourcePath);
    final Pair<PmmlConfig, ReturnError> result = new PmmlConfig.Builder().build(pmmlFile);

    Assert.assertNotNull(result.getLeft());
    Assert.assertNull(result.getRight());
  }

  private void verifyFailure(final Path resourcePath)
  {
    final File pmmlFile = ResourceUtils.getResourceAsFile(resourcePath);
    final Pair<PmmlConfig, ReturnError> result = new PmmlConfig.Builder().build(pmmlFile);

    Assert.assertNull(result.getLeft());
    Assert.assertNotNull(result.getRight());
  }
}
