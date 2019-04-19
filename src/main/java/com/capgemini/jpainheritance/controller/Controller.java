package com.capgemini.jpainheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpainheritance.enitity.Employee;
import com.capgemini.jpainheritance.enitity.Person;
import com.capgemini.jpainheritance.service.PersonService;

@RestController
public class Controller {
	
	@Autowired
	PersonService service;
	
	@RequestMapping("/")
	public void addNew() {
		Person person = new Employee(101,"John","Capgemini");
		service.add(person);
	}
	
	@RequestMapping("/get")
	public Person findById()
	{
		Person person = service.getPerson(101);
		return person;
	}

}
