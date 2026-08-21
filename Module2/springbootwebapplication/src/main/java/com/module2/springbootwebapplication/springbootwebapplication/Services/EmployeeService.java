package com.module2.springbootwebapplication.springbootwebapplication.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.module2.springbootwebapplication.springbootwebapplication.DTO.EmployeeDTO;
import com.module2.springbootwebapplication.springbootwebapplication.Entities.EmployeeEntity;
import com.module2.springbootwebapplication.springbootwebapplication.Repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final ModelMapper modelMapper;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.modelMapper = new ModelMapper();
	}


	public EmployeeDTO getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity=employeeRepository.findById(id).orElse(null);
		
		return modelMapper.map(employeeEntity,EmployeeDTO.class);
	}


	public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employeeEntities=employeeRepository.findAll();
        return employeeEntities
        .stream()
        .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class))
        .collect(Collectors.toList());
	}


	public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee) {
		// TODO Auto-generated method stub
		EmployeeEntity toSaveEntity=modelMapper.map(inputEmployee, EmployeeEntity.class);
		EmployeeEntity savedEmployeeEntity=employeeRepository.save(toSaveEntity);
		return modelMapper.map(savedEmployeeEntity, EmployeeDTO.class);
	}

}
