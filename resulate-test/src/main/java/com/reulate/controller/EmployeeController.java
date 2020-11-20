package com.reulate.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reulate.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Operation(summary = "update employee details", description = "This api will update employee details")
	@PutMapping("/employee/place/{place}/salary/{percentage}")
	public ResponseEntity<Object> updateEmployeeDetails(
			@PathVariable(value = "place") String place,
			@PathVariable(value = "percentage") Double percentage) {
		
		return employeeService.updateEmployeeDetails(place, percentage);
	}

	@Operation(summary = "Get list of Employee", description = "This api will give employee list under given place")
	@GetMapping("/employee/place/{place}")
	public ResponseEntity<Object> getEmployeesList(
			@PathVariable(value = "place") String place,
			@RequestParam(value = "pageSize") int pageSize) {
		return employeeService.getEmployeesListByPlace(place, pageSize);
	}
	
}
