package com.asales.ocmjd.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Entity Manager for all
 * 
 * @author asales
 *
 */
public class DatabaseProducer {
	
	private static EntityManager em = Persistence.
			createEntityManagerFactory("myPersistenceUnit").createEntityManager();
	
	public DatabaseProducer() {
	}
	
	/**
	 * @return DatabaseProducer instance
	 */
	public static EntityManager getEntityManager() {
		return DatabaseProducer.em;
	}
	
	

}
