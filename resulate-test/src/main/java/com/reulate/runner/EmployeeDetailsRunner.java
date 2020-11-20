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
		list.add(new EmployeeDetails(1, "Mayank", "Software Engineer", "IT", "Bangalore", "SP-001", "Development",
				45000.00));
		list.add(new EmployeeDetails(2, "Ramesh", "Software Engineer", "IT", "Bangalore", "SP-002", "Development",
				40000.00));
		list.add(new EmployeeDetails(3, "Prasad", "Software Engineer", "IT", "Bangalore", "SP-003", "Web Development",
				50000.00));
		list.add(new EmployeeDetails(4, "Aditya", "HR Manager", "Managment", "Bangalore", "SP-004", "Finance",
				30000.00));
		list.add(new EmployeeDetails(5, "Om", "Sales Manager", "Sales", "Pune", "SP-005", "Sale", 35000.00));
		list.add(
				new EmployeeDetails(6, "Swathi", "Team Lead", "IT", "Bangalore", "SP-001", "Team Managment", 80000.00));
		list.add(new EmployeeDetails(7, "Tensing", "Product Manager", "Managment", "Bangalore", "SP-001", "Managment",
				100000.00));
		list.add(new EmployeeDetails(8, "Anish", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				40000.00));
		list.add(new EmployeeDetails(9, "Vennala", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				40000.00));
		list.add(new EmployeeDetails(10, "Ginto", "Sr. Software Engineer", "IT", "Bangalore", "SP-001", "Development",
				60000.00));
		list.add(new EmployeeDetails(11, "Tony", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				36000.00));
		list.add(new EmployeeDetails(12, "Ashish", "Team Lead", "IT", "Pune", "SP-005", "Team Managment", 100000.00));
		list.add(new EmployeeDetails(13, "Monalisa", "Digital Market Executive", "Digital Marketing", "Pune", "SP-001",
				"Digital Market", 25000.00));
		list.add(new EmployeeDetails(14, "Sarita", "Software Engineer", "IT", "Pune", "SP-001", "Development",
				45000.00));
		list.add(new EmployeeDetails(15, "Aditi", "Content Writer", "Digital", "Bangalore", "SP-001", "Content Writing",
				30000.00));
		list.add(new EmployeeDetails(16, "Veeresh", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				50000.00));
		list.add(new EmployeeDetails(17, "Divakar", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				45000.00));
		list.add(new EmployeeDetails(18, "Meghna", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				30000.00));
		list.add(new EmployeeDetails(19, "Gokul", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				90000.00));
		list.add(new EmployeeDetails(20, "Nikhil", "Software Developer", "IT", "Bangalore", "SP-001", "Development",
				40000.00));
		list.add(new EmployeeDetails(21, "Niranjan", "Accountant", "Account", "Pune", "SP-001", "Account", 20000.00));
		employeeRepository.saveAll(list);
	}

}
