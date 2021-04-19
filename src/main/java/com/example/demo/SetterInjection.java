package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {

    ApplicationContext context;

    public SetterInjection() {
        System.out.println("context = " + context);
    }

    @Autowired
    public void setApplicationContext(ApplicationContext context) {
        this.context = context;
    }

    public Clazz getClass(int i) {
        return context.getBean(SpringClass.class, i);
    }
}
