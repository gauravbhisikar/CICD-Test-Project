package com.cicd.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/home")
	public ResponseEntity<String> home()
	{
		return new ResponseEntity<>("Hi from the User Service", HttpStatus.OK);
	}

}
