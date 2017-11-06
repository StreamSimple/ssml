/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.reader;

import com.simplifi.it.javautil.err.ReturnError;
import com.streamsimple.model.Model;

import java.io.InputStream;

import org.apache.commons.lang3.tuple.Pair;

public class PPMLNNClassifierReader implements Model.Reader
{
  @Override
  public Pair<Model, ReturnError> read(final InputStream inputStream)
  {
    throw new UnsupportedOperationException();
  }
}
