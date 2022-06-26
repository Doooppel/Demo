package com.doppel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJunit5 {
    @Test
    void test() {
        com.doppel.Test test = com.doppel.Test.builder().build();
        String result = test.getTestString();
        assertEquals("test",result);
    }
}
