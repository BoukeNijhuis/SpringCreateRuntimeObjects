package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context, NewClass.Factory newClassFactory) {
        return args -> {

            StringBuilder result = new StringBuilder();

            IntStream stream = IntStream.range(0, 10);

//            stream.forEach(i -> result.append(oldWay(i).getOutput()));
//            stream.forEach(i -> result.append(newWay(newClassFactory, i).getOutput()));
            stream.forEach(i -> result.append(springWay(context, i).getOutput()));


            System.out.println(result.toString());

        };
    }

    // https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-method-injection
    // ApplicationContext verkrijgen via setter injection?
    private Clazz springWay(ApplicationContext context, int i) {
        return context.getBean(OldClass.class, i);
    }


    private Clazz newWay(NewClass.Factory newClassFactory, int i) {
        return newClassFactory.createClass(i);
    }

    private Clazz oldWay(int i) {
        return new OldClass(i);
    }
}
