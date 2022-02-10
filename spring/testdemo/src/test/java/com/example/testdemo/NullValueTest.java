package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class NullValueTest {

    @Test
    public void notNullValueTest () {
        assertThat("blabla", notNullValue());
    }

    @Test
    public void nullValueTest () {
        assertThat(null, nullValue());
    }
}
