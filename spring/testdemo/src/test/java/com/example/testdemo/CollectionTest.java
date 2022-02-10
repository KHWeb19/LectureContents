package com.example.testdemo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.*;

public class CollectionTest {

    @Test
    void testArray() {
        assertThat(new Integer[]{1,2,3}, array(equalTo(1), equalTo(2), equalTo(3)));
    }

    @Test
    void testHasEntry() {
        Map<String, String> map = new HashMap<>();
        map.put("foo", "bar");

        assertThat(map, hasEntry("foo", "bar"));
        assertThat(map, hasKey("foo"));
        assertThat(map, hasValue("bar"));
    }

    @Test
    void testHasItem() {
        assertThat(Arrays.asList("foo", "bar"), hasItem(startsWith("ba")));
        assertThat(new String[] {"foo", "bar"}, hasItemInArray(startsWith("ba")));
    }
}
