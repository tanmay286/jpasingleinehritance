package com.capgemini.jpainheritance.enitity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name ="ID")
public class Employee extends Person{
	
	public String company;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int personId, String personName, String company) {
		super(personId, personName);
		this.company=company;
	}

	public Employee(String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + "]";
	}


	
	

}
