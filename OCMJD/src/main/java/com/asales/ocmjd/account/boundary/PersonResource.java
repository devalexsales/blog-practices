package com.asales.ocmjd.account.boundary;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.asales.ocmjd.account.entity.Person;
import com.asales.ocmjd.util.Store;

/**
 * Person access to the resource
 * 
 * @author asales
 *
 */
public class PersonResource {
	private static Logger LOGGER = Logger.getLogger(PersonResource.class.getName());
	
	/**  Person storage */
	private Store<Person> personStore;

	/**
	 * Registers a person
	 * 
	 * @param person contains name and email
	 */
	public void create(Person person) {
		LOGGER.log(Level.INFO, "start persist({0})", new Object[]{person});
		
		personStore.persist(person);
		
		LOGGER.log(Level.INFO, "end persist({0})", new Object[]{person});
	}
	
	/*
	 * Injections Area
	 */
	public void setPersonStore(Store<Person> personStore) {
		this.personStore = personStore;
	}
}
