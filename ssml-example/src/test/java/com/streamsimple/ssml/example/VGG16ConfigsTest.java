/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */
package com.streamsimple.ssml.example;

import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautils.testutils.DirTestWatcher;

import java.io.File;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

@Ignore
public class VGG16ConfigsTest
{
  @Rule
  public final DirTestWatcher dirTestWatcher = new DirTestWatcher.Builder()
      .setDeleteAtEnd(false)
      .build();

  @Test
  public void saveToFile()
  {
    File modelFile = dirTestWatcher
        .getDir()
        .toPath()
        .resolve("modeldata.zip")
        .toFile();

    ReturnError err = VGG16Configs.saveToFile(modelFile);
    Assert.assertNull(err);
  }
}
