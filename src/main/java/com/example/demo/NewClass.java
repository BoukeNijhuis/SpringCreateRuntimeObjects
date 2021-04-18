package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Changes relative to OldClass:
 * - factory component
 * - private constructor
 */

public class NewClass implements Clazz {

    @Component
    static class Factory {

        public NewClass createClass(int output) {
            return new NewClass(output);
        }
    }

    private final int output;

    private NewClass(int output) {
        this.output = output;
    }

    public int getOutput() {
        return output;
    }
}
