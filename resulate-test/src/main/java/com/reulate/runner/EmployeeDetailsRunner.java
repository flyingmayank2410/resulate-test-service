package com.reulate.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.reulate.model.EmployeeDetails;
import com.reulate.repository.EmployeeRepository;

@Component
public class EmployeeDetailsRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		List<EmployeeDetails> list = new ArrayList<>();
		list.add(new EmployeeDetails(1, "Mayank", "Software Developer", "IT", "Bangalore", "SP-001", "Design, Development and deployment of Application ", 40000.0));
		list.add(new EmployeeDetails(2, "Abhay", "Sales Manager", "Sale", "Bangalore", "SP-002", "", 60000.0));
		list.add(new EmployeeDetails(3, "Aditi", "Content Writer", "Digital", "Pune", "SP-003", "", 30000.0));
		list.add(new EmployeeDetails(4, "Prasad", "Web developer", "IT", "Bangalore", "SP-001", "Web Application", 50000.0));
		list.add(new EmployeeDetails(5, "Swathi", "Team Lead", "IT", "Delhi", "SP-005", "Managing Team", 90000.0));
		employeeRepository.saveAll(list);
	}

}
