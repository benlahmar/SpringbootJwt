package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRest {

	@GetMapping("/task")
	public String getx()
	{
		return "info apres authentification";
	}
}
