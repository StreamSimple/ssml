/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.model.nn.classifier.reader;

import com.google.common.base.Preconditions;
import com.streamsimple.model.nn.classifier.ClassifierModel;

public enum ConfigType
{
  PMML(new PPMLNNClassifierReader()),
  DL4J_0_9_1(new DL4J_0_9_1NNClassifierReader());

  private ClassifierModel.Reader reader;

  ConfigType(ClassifierModel.Reader reader)
  {
    this.reader = Preconditions.checkNotNull(reader);
  }

  public ClassifierModel.Reader getReader()
  {
    return reader;
  }
}
