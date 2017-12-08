/*
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.nd4j.linalg.api.ndarray.INDArray;

import com.streamsimple.guava.common.base.Preconditions;

public class ComputationGraphModel implements Model
{
  private final ComputationGraph cg;

  public ComputationGraphModel(final ComputationGraph cg)
  {
    this.cg = Preconditions.checkNotNull(cg);
  }

  @Override
  public INDArray[] output(INDArray... inputs)
  {
    return cg.output(inputs);
  }
}
