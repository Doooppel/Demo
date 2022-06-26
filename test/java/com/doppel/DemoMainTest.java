package com.doppel;

import com.doppel.test.DemoMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoMainTest {
    @Test
    void test() {
        DemoMain demoMain = DemoMain.builder().build();
        String result = demoMain.getTestString();
        assertEquals("test",result);
    }
}
