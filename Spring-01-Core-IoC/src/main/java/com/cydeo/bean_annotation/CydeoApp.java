package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        /*
        container.getBean(FullTimeMentor.class)
        means go to container and tell spring give FullTimeMentor object(bean)
        ft is a bean from the container
         */
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        System.out.println(container.getBean(String.class));
    }
}
