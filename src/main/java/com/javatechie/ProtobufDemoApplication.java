package com.javatechie;

import com.javatechie.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProtobufDemoApplication {

	public static void main(String[] args) {

//		Employee.newBuilder()
//						.setId(101)
//								.setName("Basant");
		//changes committed from main remote
		SpringApplication.run(ProtobufDemoApplication.class, args);
	}

}
