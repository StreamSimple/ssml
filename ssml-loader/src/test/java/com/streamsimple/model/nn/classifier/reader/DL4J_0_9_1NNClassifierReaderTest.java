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

import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.streamsimple.awsutilstest.AWSUtils;
import com.streamsimple.categories.AWSTest;
import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.model.nn.classifier.ClassifierModel;

@Category(AWSTest.class)
public class DL4J_0_9_1NNClassifierReaderTest
{
  public static final String BUCKET_REGION = "us-west-1";
  public static final String BUCKET_NAME = "streamsimple.otterx.ml.test";
  public static final String NEURALNET_DAT = "neuralnet.dat";

  @Test
  public void s3ReadTest()
  {
    final String awsAccessKey = AWSUtils.getAWSAccessKey();
    final String awsSecretKey = AWSUtils.getAWSSecretKey();

    final AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(
        new BasicAWSCredentials(awsAccessKey, awsSecretKey));

    final AmazonS3 s3 = AmazonS3ClientBuilder
        .standard()
        .withCredentials(credentialsProvider)
        .withRegion(BUCKET_REGION)
        .build();

    InputStream inputStream = s3.getObject(BUCKET_NAME, NEURALNET_DAT)
        .getObjectContent();

    Pair<ClassifierModel, ReturnError> result = ConfigType.DL4J_0_9_1.getReader().read(inputStream);
    Assert.assertNotNull(result.getLeft());
  }
}
