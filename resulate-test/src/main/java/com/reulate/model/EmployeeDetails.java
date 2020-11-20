package com.reulate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7515346735752451800L;
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeID ;
	
	public EmployeeDetails(Integer employeeID, String employeeName, String title, String businessUnit, String place,
			String supervisorID, String competencies, Double salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.title = title;
		this.businessUnit = businessUnit;
		this.place = place;
		this.supervisorID = supervisorID;
		this.competencies = competencies;
		this.salary = salary;
	}
	
	public EmployeeDetails() {}

	@Column(name = "employee_name")
	private String employeeName ;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "business_unit")
	private String businessUnit;
	
	@Column(name = "place")
	private String place;
	
	@Column(name = "supervisor_id")
	private String supervisorID;
	
	@Column(name = "competencies")
	private String competencies ;
	
	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}

	public String getCompetencies() {
		return competencies;
	}

	public void setCompetencies(String competencies) {
		this.competencies = competencies;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Column(name = "salary")
	private Double salary; 
	
	
	

}
