package com.swag.interfac;

import java.util.List;

import com.swag.entity.Person;

public interface ServiceIntrf {

	public List<Person> getAllData();
	public void addDetails(Person person);
	//public void updateDetails(Integer adhar_id,Person person);
	public void deleteDetails(Integer adhar_id);
}
