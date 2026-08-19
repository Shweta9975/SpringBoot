package com.module2.springbootwebapplication.springbootwebapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.module2.springbootwebapplication.springbootwebapplication.Entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
