package com.example.deploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class DeployTestApplication {

	public static void main(String[] args) {
		System.out.println("HI Im dev branch");
		System.out.println("workflows/gradle.yml생성");
		SpringApplication.run(DeployTestApplication.class, args);
	}

}
