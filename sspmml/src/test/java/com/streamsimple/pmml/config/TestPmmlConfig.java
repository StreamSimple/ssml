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
package com.streamsimple.pmml.config;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautils.testutils.ResourceUtils;

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
