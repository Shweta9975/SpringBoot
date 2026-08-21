package com.module2.springbootwebapplication.springbootwebapplication.Controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.module2.springbootwebapplication.springbootwebapplication.DTO.EmployeeDTO;
import com.module2.springbootwebapplication.springbootwebapplication.Entities.EmployeeEntity;
import com.module2.springbootwebapplication.springbootwebapplication.Repositories.EmployeeRepository;
import com.module2.springbootwebapplication.springbootwebapplication.Services.EmployeeService;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {

//	@GetMapping(path="/getSecretMessage")
//	public String getMySuperSecretMessage() {
//		return "asdgh@#$DASD";
//}
	
	private final EmployeeService employeeService; 
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/{employeeId}")
	public EmployeeEntity getEmployeeById(@PathVariable(name="employeeId") Long id) {
		return  employeeService.getEmployeeById(id);
		
	}
	
//	@GetMapping(path="/employees")
//	public String getAllEmployees(@RequestParam(required=false) Integer age,
//			                      @RequestParam(required=false) String sortBy){ //used required to make parameter optional
//		return "Hi age "+age+ " "+sortBy;
//		
//	}
	
	

	//we can use GetMapping without ("/employees") since we are inside employeecontroller
	@GetMapping
	public List<EmployeeEntity> getAllEmployees(@RequestParam(required=false,name="inputAge") Integer age,
			                      @RequestParam(required=false) String sortBy){ //used required to make parameter optional
		return employeeService.getAllEmployees();
		
	}
	
//	@PostMapping
//	public String createNewEmployee() {
//		return "Hello From Post";
//	}
	
	@PostMapping
	public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputEmployee) {

		return employeeService.createNewEmployee(inputEmployee);
	}
	
	@PutMapping
	public String updateEmployeeById() {
		return "Hello From Put";
	}
}
