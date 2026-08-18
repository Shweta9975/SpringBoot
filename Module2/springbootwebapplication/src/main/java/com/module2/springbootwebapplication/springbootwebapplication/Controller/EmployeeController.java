package com.module2.springbootwebapplication.springbootwebapplication.Controller;


import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.module2.springbootwebapplication.springbootwebapplication.DTO.EmployeeDTO;

@RestController
public class EmployeeController {

//	@GetMapping(path="/getSecretMessage")
//	public String getMySuperSecretMessage() {
//		return "asdgh@#$DASD";
//}
	
	@GetMapping("/employees/{employeeId}")
	public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
		return new EmployeeDTO(employeeId,"Shweta","shwetamane@gmail.com",25,LocalDate.of(2026, 8, 18),true);
		
	}
}
