package com.swag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="person")
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adhar_id")
	Integer adharID;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "address")
	String address;
	

	
	public Person() {
	
	}



	@Builder
	public Person(int adharID, String name, String address) {
		this.adharID = adharID;
		this.name = name;
		this.address = address;
	}

	

	
	
	


}
