package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    SetterInjection setterInjection;

    @Test
    public void werktDeDependencyInjectie() {

        SpringClass springClass = context.getBean(SpringClass.class, 1);
        assertEquals(1, springClass.getOutput());

    }

    @Test
    public void werktDeDependencyInjectieMetSetter() {

        Clazz aClass = setterInjection.getClass(9);
        assertEquals(9, aClass.getOutput());

    }


}
