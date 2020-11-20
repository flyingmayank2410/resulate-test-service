package com.reulate.service;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {

	ResponseEntity<Object> updateEmployeeDetails(String place, Double percentage);

	ResponseEntity<Object> getEmployeesListByPlace(String place, int pageSize);

}
