/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier;

import com.google.common.base.Preconditions;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.nd4j.linalg.api.ndarray.INDArray;

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
