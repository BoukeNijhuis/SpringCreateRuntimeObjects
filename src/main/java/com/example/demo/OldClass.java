package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OldClass implements Clazz {

    private final int output;

    public OldClass(int output) {
        this.output = output;
    }

    public int getOutput() {
        return output;
    }
}
