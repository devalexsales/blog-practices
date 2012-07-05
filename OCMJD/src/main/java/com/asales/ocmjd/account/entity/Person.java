package com.asales.ocmjd.account.entity;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Person visiting the site
 * 
 * @author asales
 *
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {
	private static Logger LOGGER = Logger.getLogger(Person.class.getName());
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="person")
	private String person;
	
	@Column(name="email")
	private String email;

	public long getId() {
		return id;
	}
	
	public Person() {
		//For JPA
	}
	
	public Person(long id, String person, String email) {
		this.id = id;
		this.person = person;
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		LOGGER.log(Level.WARNING, "" +
				"id[{0}]," +
				"person[{1}]," +
				"email[{2}]", 
				new Object[] {id,person,email});
		
		return super.toString();
	}
	
	
}
