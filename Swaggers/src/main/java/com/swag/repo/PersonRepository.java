package com.swag.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.swag.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	//@Query("FROM person WHERE name=?1" )
	//List<Person> findByName(String name);
	
	//@Query("select c from City c where c.name like %?1")
    //List<Person> findByNameEndsWith(String chars);
	
	//@Query(value = "SELECT * FROM person ORDER BY adhar_id OFFSET 1 ROWS", nativeQuery=true)
	//List<Person> findByAdharIDTwo();
}
