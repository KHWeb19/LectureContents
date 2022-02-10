package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;

public class TextTest {

    @Test
    void testEqualToIgnoringCase() {
        assertThat("TEXt", equalToIgnoringCase("text"));
    }

    @Test
    void testContainsString() {
        assertThat("text", containsString("e"));
    }

    @Test
    void testEndsWith() {
        assertThat("text", endsWith("xt"));
        assertThat("text", startsWith("te"));
    }
}
