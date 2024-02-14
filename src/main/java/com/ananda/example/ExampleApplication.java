package com.ananda.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
		System.out.println("Changes");
		System.out.println("3 way testing in branch_to_be_merged branch");
		System.out.println("Changed done here but not pulled in branch_to_be_merged branch");
		System.out.println("Changes for rebasing");
	}

}
