package com.monexplorer.app.rest;

import com.monexplorer.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApiApplication  {
	@Autowired
	private TodoRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}


}
