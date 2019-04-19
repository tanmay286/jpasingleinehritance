package com.capgemini.jpainheritance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpainheritance.PersonDao;
import com.capgemini.jpainheritance.enitity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	
	@Autowired
	PersonDao dao;
	@Override
	public void add(Person person) {
	
		dao.save(person);
		
		
	}

	@Override
	public Person getPerson(int id) {
		Person person = dao.findById(id).get();
		return person;
	}

}
