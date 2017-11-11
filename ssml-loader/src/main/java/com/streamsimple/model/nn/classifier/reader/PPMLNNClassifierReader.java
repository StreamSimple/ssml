/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier.reader;

import com.simplifi.it.javautil.err.ReturnError;
import com.streamsimple.model.nn.classifier.ClassifierModel;

import java.io.InputStream;

import org.apache.commons.lang3.tuple.Pair;

public class PPMLNNClassifierReader implements ClassifierModel.Reader
{
  @Override
  public Pair<ClassifierModel, ReturnError> read(final InputStream inputStream)
  {
    throw new UnsupportedOperationException();
  }
}
