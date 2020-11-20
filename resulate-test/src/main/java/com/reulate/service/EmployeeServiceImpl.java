package com.reulate.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.reulate.model.EmployeeDetails;
import com.reulate.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public ResponseEntity<Object> updateEmployeeDetails(String place, Double percentage) {

		Map<String, String> response = new HashMap<>();

		if (percentage > 55) {
			response.put("message", "Please provide percentage less than 55");
			return ResponseEntity.badRequest().body(response);
		}

		List<EmployeeDetails> list = employeeRepository.findByPlace(place);
		if (list != null && !list.isEmpty()) {
			list.forEach(emp -> {
				updateEmployeeDetails(emp, percentage);
			});
			employeeRepository.saveAll(list);
		} else {
			response.put("message", "No employee work under given place");
			return ResponseEntity.badRequest().body(response);
		}
		response.put("message", "Employee Details Updated Successfully");
		return ResponseEntity.ok(response);

	}

	private void updateEmployeeDetails(EmployeeDetails emp, Double percentage) {
		Double sal = emp.getSalary();
		Double inrementSal = (sal * percentage) / 100;
		sal = sal + inrementSal;
		emp.setSalary(sal);
	}

	@Override
	public ResponseEntity<Object> getEmployeesListByPlace(String place, int pageSize) {
		Map<String, Object> response = new HashMap<>();

		if (pageSize < 1) {
			response.put("message", "Please provide page size greater than zero");
			return ResponseEntity.badRequest().body(response);
		}

		List<EmployeeDetails> list = employeeRepository.findAllByPlace(place, PageRequest.of(pageSize - 1, 5));
		response.put("data", list);
		response.put("message", "Success");
		if (list != null && !list.isEmpty())
			response.put("status", 200);
		else
			response.put("status", 204);
		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<Object> getRangeSalary(String competency) {
		Double range = 0.0;
		Map<String, Object> response = new HashMap<>();
		List<EmployeeDetails> list = employeeRepository.findAllByCompetencies(competency);
		if(list != null && !list.isEmpty()) {
			Double sum = 0.0;
			for(EmployeeDetails emp : list)	{
				sum = sum + emp.getSalary();
			}
			range = sum / list.size();
			response.put("range", range);
			response.put("message", "Success");
		}
		return ResponseEntity.ok(response);
	}

}
