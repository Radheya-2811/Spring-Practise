package com.harsh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Collections;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		///setting up profiles programatically//////////////////////////////////

//		var app =new SpringApplication(ExampleApplication.class);
//		app.setDefaultProperties(
//				Collections.singletonMap("spring.profiles.active", "test")
//		);
//		var x=app.run(args);
////////////////////////////////////////

		var x=SpringApplication.run(ExampleApplication.class, args);

		//MyFirstClass myFirstClass=x.getBean(MyFirstClass.class);
		//MyFirstClass myFirstClass1=x.getBean("myFirstService", MyFirstClass.class);
		//System.out.println(myFirstClass1.sayHello());
		//System.out.println(myFirstClass.sayHello());

		MyFirstService myFirstService=x.getBean(MyFirstService.class);
	//	System.out.println(myFirstService.tellAStory());
		//System.out.println(myFirstService.getCustomPopertyFromAnotherFile());
	//	System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getAppilcationProperty());
// 		System.out.println(myFirstService.getJavaVersion());
//		System.out.println(myFirstService.getOsName());
//		System.out.println(myFirstService.readProp());
//		System.out.println(myFirstService.readProp2());

	}



}
