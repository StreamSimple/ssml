/*
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn;

import java.io.InputStream;

import org.nd4j.linalg.api.ndarray.INDArray;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.javautil.err.ReturnError;

public interface Model
{
  INDArray[] output(INDArray... inputs);

  interface Reader
  {
    Pair<Model, ReturnError> read(InputStream inputStream);
  }
}
