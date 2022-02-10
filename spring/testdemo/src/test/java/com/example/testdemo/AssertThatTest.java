package com.example.testdemo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertThatTest {

    @Test
    public void equalToTest () {
        assertThat(new String[] { "a", "b", "c" }, equalTo(new String[] { "a", "b" }));
    }

    @Test
    public void equalToArrayTest () {
        assertThat(Arrays.asList(new String[] { "a" }),
                equalTo(Arrays.asList(new String[] { "a", "ab" })));
    }

    @Test
    public void notEqualToTest () {
        assertThat(Arrays.asList(new String[] { "a" }),
                not(equalTo(Arrays.asList(new String[] { "a", "ab" }))));
    }
}
