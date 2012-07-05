package com.asales.ocmjd.account.boundary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.asales.ocmjd.account.control.PersonStore;
import com.asales.ocmjd.account.entity.Person;
import com.asales.ocmjd.util.Store;

import static org.junit.Assert.*;

public class PersonResourceIT {
	
	private Store<Person> personStore;
	private EntityManager em;
	private EntityTransaction tx;

	@Before
	public void setUp() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        
        personStore = new PersonStore();
	}
	

	@Test
	public void testPersonPersist() {
		Person testPerson = new Person(0, "alex sales", "k642alex@yahoo.com");
		personStore.persist(testPerson);
		Person actual = em.find(Person.class, testPerson);
		
		assertThat(actual, CoreMatchers.is(testPerson));
	}
	
	@After
	public void clear() {
		tx.begin();
        em.createQuery("delete from PERSON").executeUpdate();
        tx.commit();
        em.clear();
	}

}
