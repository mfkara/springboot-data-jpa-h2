package com.mfkara.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mfkara.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee
			, Long> {

}