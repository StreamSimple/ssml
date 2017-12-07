/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn.classifier;

import com.google.common.base.Preconditions;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;

public class MultiLayerNetworkClassifierModel implements ClassifierModel
{
  private final MultiLayerNetwork net;

  public MultiLayerNetworkClassifierModel(final MultiLayerNetwork net)
  {
    this.net = Preconditions.checkNotNull(net);
  }

  @Override
  public INDArray output(INDArray input)
  {
    return net.output(input);
  }

  @Override
  public Type getType()
  {
    return Type.ONE_HOT;
  }
}
