package com.example.LoginCreation2;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args)throws Exception{
		Employee e1=new Employee(1,"Sugan","CBE");
		Employee e2= new Employee(2,"Haran","CBE");
		empRepository.employee.addAll(Arrays.asList(e1,e2));

	}

}
