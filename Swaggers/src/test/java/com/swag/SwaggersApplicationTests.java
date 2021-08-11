package com.swag;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.swag.entity.Person;
import com.swag.repo.PersonRepository;
import com.swag.serveice.PersonService;


@SpringBootTest
@RunWith(SpringRunner.class)
class SwaggersApplicationTests {

/*	@Autowired
	private PersonService personService;
	
	@Autowired
	private PersonRepository personRepository;
	

	@Test
	public void getUsersTest() {
		when(personRepository.findAll()).thenReturn(Stream
				.of(new Person(1, "Pratik", "Kopargaon"), new Person(2, "Veer", "Bengaluru")).collect(Collectors.toList()));
		assertEquals(2, personService.getAllData().size());
	}
	
	/*@Tes
	@Order(1)
	public void addData() {
		Person person = new Person();
		person.setName("Pratik Adhav");
		person.setAddress("Kopargaon");
		personRepo.save(person);
		assertNotNull(personRepo.findById(8).get());
		
	}
	
	@Test
	@Order(2)
	public void all() {
		List<Person> show = (List<Person>) personRepo.findAll();
		assertThat(show).size().isGreaterThan(0);
	
	}

	@Test
	@Order(3)
	public void getById() {
		Person person = personRepo.findById(1).get();
		assertEquals("Kopargaon", person.getAddress());
		
		
	}
	
	@Test
	@Order(4)
	public void update() {
		Person data = personRepo.findById(4).get();
		data.setAddress("Kolkata");
		personRepo.save(data);
		assertNotEquals("Kopargaon", personRepo.findById(4).get().getAddress());
	}
	
	@Test
	@Order(5)
	public void remove() {
		personRepo.deleteById(6);
		assertThat(personRepo.existsById(6)).isFalse();
	}*/
	
	
}
