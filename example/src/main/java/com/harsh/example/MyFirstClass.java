package com.harsh.example;
import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MyFirstClass {
    private final String myVar;

    public MyFirstClass(@Value("myVar") String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello"+myVar+"! THis is your first program in springboot";
    }
}
