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
package com.streamsimple.model.nn.classifier;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.nd4j.linalg.api.ndarray.INDArray;

import com.streamsimple.guava.common.base.Preconditions;

public class ComputationGraphClassifierModel implements ClassifierModel
{
  private final ComputationGraph cg;

  public ComputationGraphClassifierModel(final ComputationGraph cg)
  {
    this.cg = Preconditions.checkNotNull(cg);
  }

  @Override
  public INDArray output(INDArray input)
  {
    return cg.output(input)[0];
  }

  @Override
  public Type getType()
  {
    return Type.ONE_HOT;
  }
}
