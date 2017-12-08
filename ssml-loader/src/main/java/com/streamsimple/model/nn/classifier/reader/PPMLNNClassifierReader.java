/*
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn.classifier.reader;

import java.io.InputStream;

import com.streamsimple.commons.lang3.tuple.Pair;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.model.nn.classifier.ClassifierModel;

public class PPMLNNClassifierReader implements ClassifierModel.Reader
{
  @Override
  public Pair<ClassifierModel, ReturnError> read(final InputStream inputStream)
  {
    throw new UnsupportedOperationException();
  }
}
