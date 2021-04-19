package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringClass implements Clazz {

    private final int output;

    public SpringClass(int output) {
        this.output = output;
    }

    public int getOutput() {
        return output;
    }
}
