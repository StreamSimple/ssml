/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier;

import com.streamsimple.javautil.err.ReturnError;
import java.io.InputStream;
import org.apache.commons.lang3.tuple.Pair;
import org.nd4j.linalg.api.ndarray.INDArray;

public interface ClassifierModel
{
  INDArray output(INDArray input);

  Type getType();

  enum Type
  {
    ONE_HOT
  }

  interface Reader
  {
    Pair<ClassifierModel, ReturnError> read(InputStream inputStream);
  }
}
