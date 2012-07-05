package com.asales.ocmjd.account.control;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.asales.ocmjd.account.entity.Person;
import com.asales.ocmjd.util.DatabaseProducer;
import com.asales.ocmjd.util.Store;

/**
 * Person database access
 * 
 * @author asales
 *
 */
public class PersonStore implements Store<Person>{
	private static Logger LOGGER = Logger.getLogger(PersonStore.class.getName());
	
	private static EntityManager em = DatabaseProducer.getEntityManager();
	
	
	/**
	 * Persists person to an area
	 */
	public void persist(Person person) {
		LOGGER.log(Level.INFO, "start persist({0})", new Object[]{person});
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		LOGGER.log(Level.INFO, "end persist({0})", new Object[]{person});
	}

	
}
