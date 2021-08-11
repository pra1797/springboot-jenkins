package com.swag.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swag.entity.Person;
import com.swag.repo.PersonRepository;
import com.swag.serveice.PersonService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Contact;


@RestController
@RequestMapping("/person")
@CrossOrigin
public class Personcontroller {

	@Autowired
	private PersonService personserve;
	
	@Autowired
	private PersonRepository personRepo;
	
	/*@GetMapping(value = "/two")
	List<Person> findByAdharIDTwo(int adharID){
		return personserve.findByAdharIDTwo();
	}*/

	@GetMapping(value = "/all") //http://localhost:8080/person/
	@ApiOperation(value = "Find all Data in Details" , notes = "Show you all data", response = Contact.class)
	public List<Person> getAllData(){
		return  personserve.getAllData();
	}
	
	/*@GetMapping("/{adhar_id}")
	public List<Person> getPerson(@PathVariable String name) {
		return personserve.getPerson(name);
	}*/
	
	  //get all data
	@GetMapping("/{adhar_id}")
	   public ResponseEntity<Person> getPersonById(@PathVariable(value = "adhar_id") int adhar_id)
	        throws Exception {
	        Person person = personRepo.findById(adhar_id)
	          .orElseThrow(() -> new Exception("Persone not found for this id :: " + adhar_id));
	        return ResponseEntity.ok().body(person);
	    }
	
	  
	 //inssert eron data
	@PostMapping(value = "/post")
	public void addDetails(@RequestBody Person person) {
		 personserve.addDetails(person); //response in boolean
		 
		 System.out.println("new data added");
	}
	
	/*@PutMapping(value = "/put/{adhar_id}")
	public void updateDetails(@ApiParam(value = "ID for the data you want to update", required = true) @PathVariable Integer adhar_id, @RequestBody Person person) {
		personserve.updateDetails(adhar_id, person);
		
		System.out.println("Data edited");
	}*/
	@PutMapping(value = "/put/{adhar_id}")
    public ResponseEntity<Person> updatePerson(@PathVariable int adhar_id, @RequestBody Person person) {
        Person currentPerson = personRepo.findById(adhar_id).orElseThrow(RuntimeException::new);
        currentPerson.setName(person.getName());
        currentPerson.setAddress(person.getAddress());
        currentPerson = personRepo.save(person);

        return ResponseEntity.ok(currentPerson);
    }
	
	
	@DeleteMapping(value = "/del/{adhar_id}")
	public void deleteDetails(@PathVariable Integer adhar_id) {
		personserve.deleteDetails(adhar_id);
		
		System.out.println("Delete");
	}
	
}
