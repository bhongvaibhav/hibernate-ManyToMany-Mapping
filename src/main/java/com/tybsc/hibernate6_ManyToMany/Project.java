package com.tybsc.hibernate6_ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project 
{
	@Id
	private int proID;
	private String proName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Employee>employees;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int proID, String proName) {
		super();
		this.proID = proID;
		this.proName = proName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

	
}
