package com.module2.springbootwebapplication.springbootwebapplication.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDate dateOfJoining;
	private Boolean isActive;
}
