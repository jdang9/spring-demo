package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/person")
@Api(value = "Demo API")
public class PersonController {

	@GetMapping("/greeting")
	@ApiOperation(value = "Get a greeting", response = String.class)
	public String getGreeting() {
		return "Hello, World!";
	}

}
