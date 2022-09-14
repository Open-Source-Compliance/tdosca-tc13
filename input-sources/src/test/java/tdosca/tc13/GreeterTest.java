/*
 * Copyright (C) 2022 Karsten Reincke, Deutsche Telekom AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package tdosca.tc13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

  Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void test1() {
    assertEquals("back0", greeter.speak());
  }

  @Test
  public void test2() {
    assertEquals("back1", greeter.speak("TEST2"));
  }
}
