package com.example.hookJVM;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
