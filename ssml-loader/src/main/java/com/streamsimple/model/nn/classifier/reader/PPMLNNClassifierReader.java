/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier.reader;

import com.simplifi.it.javautil.err.ReturnError;
import com.streamsimple.model.nn.Model;
import com.streamsimple.model.nn.classifier.ClassifierModel;

import java.io.InputStream;

import org.apache.commons.lang3.tuple.Pair;

public class PPMLNNClassifierReader implements Model.Reader
{
  @Override
  public Pair<Model, ReturnError> read(final ClassifierModel.Type classifierType, final InputStream inputStream)
  {
    throw new UnsupportedOperationException();
  }
}
