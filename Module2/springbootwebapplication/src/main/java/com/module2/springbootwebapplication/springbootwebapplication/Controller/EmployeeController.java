package com.module2.springbootwebapplication.springbootwebapplication.Controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.module2.springbootwebapplication.springbootwebapplication.DTO.EmployeeDTO;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {

//	@GetMapping(path="/getSecretMessage")
//	public String getMySuperSecretMessage() {
//		return "asdgh@#$DASD";
//}
	
	@GetMapping("/{employeeId}")
	public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
		return new EmployeeDTO(employeeId,"Shweta","shwetamane@gmail.com",25,LocalDate.of(2026, 8, 18),true);
		
	}
	
//	@GetMapping(path="/employees")
//	public String getAllEmployees(@RequestParam(required=false) Integer age,
//			                      @RequestParam(required=false) String sortBy){ //used required to make parameter optional
//		return "Hi age "+age+ " "+sortBy;
//		
//	}
	
	//we can use GetMapping without ("/employees") since we are inside employeecontroller
	@GetMapping
	public String getAllEmployees(@RequestParam(required=false) Integer age,
			                      @RequestParam(required=false) String sortBy){ //used required to make parameter optional
		return "Hi age "+age+ " "+sortBy;
		
	}
}
