package com.module2.springbootwebapplication.springbootwebapplication.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(path="/getSecretMessage")
	public String getMySuperSecretMessage() {
		return "asdgh@#$DASD";
}
	
}
