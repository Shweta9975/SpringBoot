package com.module2.springbootwebapplication.springbootwebapplication.DTO;

import java.time.LocalDate;

public class EmployeeDTO {

	private Long id;
	private String name;
	private String email;
	private LocalDate dateOfJoining;
	private Boolean isActive;
	
	
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeDTO(Long id, String name, String email, LocalDate dateOfJoining, Boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfJoining = dateOfJoining;
		this.isActive = isActive;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
