package com.code.java.practice.Extra;

import java.util.List;
import java.util.random.RandomGenerator;

@FunctionalInterface
interface MessageProvider {
    default String getMessage() {
        return "Hello World";
    }

    abstract void processMessage();
}

public class Practice {

    public static void main(String[] args) {

    }
}
