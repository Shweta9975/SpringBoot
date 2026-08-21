package com.module2.springbootwebapplication.springbootwebapplication.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.module2.springbootwebapplication.springbootwebapplication.Entities.EmployeeEntity;
import com.module2.springbootwebapplication.springbootwebapplication.Repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	public EmployeeEntity getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}


	public List<EmployeeEntity> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}


	public EmployeeEntity createNewEmployee(EmployeeEntity inputEmployee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(inputEmployee);
	}

}
