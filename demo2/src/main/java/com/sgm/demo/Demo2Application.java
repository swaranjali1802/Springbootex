package com.sgm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(Demo2Application.class, args);
		System.out.println("Spring boot app running");
		Trainee t1=context.getBean(Trainee.class);
		t1.display();
		Trainee t2=context.getBean(Trainee.class);
		t2.display();

		}
		
		
	}


