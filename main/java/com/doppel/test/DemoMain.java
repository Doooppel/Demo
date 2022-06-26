package com.doppel.test;

import lombok.Builder;

@Builder
public class DemoMain {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public String getTestString() {
        return "te2st";
    }
}
