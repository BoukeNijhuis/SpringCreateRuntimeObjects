package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTestsJunit5 {

    @Test
    void werktDeDependencyInjectie(@Autowired ApplicationContext context) {

        SpringClass springClass = context.getBean(SpringClass.class, 1);
        Assertions.assertEquals(1, springClass.getOutput());

    }

    @Test
    void werktDeDependencyInjectieMetSetter(@Autowired SetterInjection setterInjection) {

        Clazz aClass = setterInjection.getClass(9);
        Assertions.assertEquals(9, aClass.getOutput());

    }


}
