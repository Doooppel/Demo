package com.doppel;

import lombok.Builder;

@Builder
public class Test {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public String getTestString() {
        return "test";
    }
}
