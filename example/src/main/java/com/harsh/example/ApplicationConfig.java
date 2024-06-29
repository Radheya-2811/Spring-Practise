package com.harsh.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ApplicationConfig {


    @Bean
    @Primary
    @Qualifier("bean1")
    @Profile("profile1")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("First Bean");
    }
    @Bean
    @Qualifier("bean2")
    @Profile("test")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("second Bean");
    }

}
