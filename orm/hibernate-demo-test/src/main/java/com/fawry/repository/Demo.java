package com.fawry.repository;

import com.fawry.entities.Test;

import java.nio.charset.Charset;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {

		 //JPA Start

/*		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Session session = entityManager.unwrap(Session.class);
		entityManager.getTransaction().begin();
		//entityManager.persist(employee);
		Test test = entityManager.find(Test.class, 1);
		System.out.println("name :: " + test.getName());
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();*/

		//JPA End

		// hibernate start

		//TestReository testReository = new TestReository();

/*		// create start
		Test test = getDummyObj();
		testReository.create(test);
		// create end*/

/*		// get start
		Test test = testReository.get(1);
		System.out.println(test.getName());
		// get end*/

/*		//list start
		List<Test> list = testReository.list();
		list
				.stream()
				.forEach(element -> System.out.println(element.getName()));
		//list end*/

		// hibernate end
	}

	public static Test getDummyObj() {
		Test test = new Test();
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));
		test.setName("ali " + generatedString);
		return test;
	}

}
