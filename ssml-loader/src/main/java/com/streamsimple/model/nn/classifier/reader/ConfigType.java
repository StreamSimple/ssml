/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.model.nn.classifier.reader;

import com.google.common.base.Preconditions;
import com.streamsimple.model.nn.Model;

public enum ConfigType
{
  PMML(new PPMLNNClassifierReader()),
  DL4J_0_9_1(new DL4J_0_9_1NNClassifierReader());

  private Model.Reader reader;

  ConfigType(Model.Reader reader)
  {
    this.reader = Preconditions.checkNotNull(reader);
  }

  public Model.Reader getReader()
  {
    return reader;
  }
}
