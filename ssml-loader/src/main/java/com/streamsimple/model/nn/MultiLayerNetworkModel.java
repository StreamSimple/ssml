/*
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;

import com.streamsimple.guava.common.base.Preconditions;

public class MultiLayerNetworkModel implements Model
{
  private final MultiLayerNetwork net;

  public MultiLayerNetworkModel(final MultiLayerNetwork net)
  {
    this.net = Preconditions.checkNotNull(net);
  }

  @Override
  public INDArray[] output(INDArray... inputs)
  {
    Preconditions.checkArgument(inputs.length == 1);

    return new INDArray[]{net.output(inputs[0])};
  }
}
