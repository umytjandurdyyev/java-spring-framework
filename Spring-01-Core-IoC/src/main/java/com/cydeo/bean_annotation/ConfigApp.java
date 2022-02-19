package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean // we are using show the spring what kind of bean is to be created in the container
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean
    @Primary
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

//    @Bean(name = "test")
    @Bean
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }
}
