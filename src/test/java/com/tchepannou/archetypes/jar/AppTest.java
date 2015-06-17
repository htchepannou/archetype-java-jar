package com.tchepannou.archetypes.jar;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends TestCase {

    public void testSay() throws Exception {
        assertThat(new App().say("hello")).isEqualTo("hello");
    }
}
