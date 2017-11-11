/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier;

import org.nd4j.linalg.api.ndarray.INDArray;

public interface ClassifierModel
{
  INDArray output(INDArray input);

  Type getType();

  enum Type
  {
    ONE_HOT
  }
}
