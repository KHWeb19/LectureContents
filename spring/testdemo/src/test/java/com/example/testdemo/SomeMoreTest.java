package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class SomeMoreTest {

    @Test
    void closeToTest() {
        assertThat(Math.abs(3.33 * 3), closeTo(9.989999999, 0.0005));
    }
}
