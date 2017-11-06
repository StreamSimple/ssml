/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model;

import com.simplifi.it.javautil.err.ReturnError;

import java.io.InputStream;

import org.apache.commons.lang3.tuple.Pair;
import org.nd4j.linalg.api.ndarray.INDArray;

public interface Model
{
  INDArray[] output(INDArray... inputs);

  interface Reader
  {
    Pair<Model, ReturnError> read(InputStream inputStream);
  }
}