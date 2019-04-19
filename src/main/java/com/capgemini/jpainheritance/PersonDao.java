package com.capgemini.jpainheritance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpainheritance.enitity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
