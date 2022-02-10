package com.example.testdemo;

import org.hamcrest.object.IsCompatibleType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.sameInstance;

public class ObjectValueTest {

    @Test
    void testHasToString() {
        assertThat(true, hasToString("true"));
    }

    @Test
    void testInstanceOf() {
        assertThat("test", instanceOf(String.class));
    }

    @Test
    void testIsCompatibleType() {
        assertThat(Integer.class, IsCompatibleType.typeCompatibleWith(Number.class));
    }

    @Test
    void testSameInstance() {
        assertThat(new String[] {"foo", "bar"}, sameInstance(new String[] {"foo", "bar"}));
    }
}
