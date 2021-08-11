package com.swag.serveice;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swag.entity.Person;
import com.swag.interfac.ServiceIntrf;
import com.swag.repo.PersonRepository;


@Service
public class PersonService implements ServiceIntrf{
	
	@Autowired
	private PersonRepository personrepos;
	
	public List<Person> getAllData(){
		List<Person> data = new ArrayList<>();
		personrepos.findAll().forEach(data::add);
		System.out.println(data.toString());
		return data;
	}


//	public List<Person> getPerson(String name) {
	//	return personrepos.findByName(name);
	//}

	public void addDetails(Person person) {
		personrepos.save(person);
		
		System.out.println("Operation perform for add");
	}

	/*public void updateDetails(Integer adhar_id,Person person) {
		personrepos.save(person);
		
		System.out.println("Operation perform for update");
	}*/

	public void deleteDetails(Integer adhar_id) {
		personrepos.deleteById(adhar_id);
		
		System.out.println("Operation perform for delete");
	}


	/*public List<Person> findByAdharIDTwo() {
		List<Person> data = new ArrayList<>();
		personrepos.findByAdharIDTwo().forEach(data::add);
		System.out.println(data.toString());
		return data;
	}*/
	
	
}
