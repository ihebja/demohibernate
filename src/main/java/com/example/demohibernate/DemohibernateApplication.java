package com.example.demohibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemohibernateApplication {

	public static void main(String[] args) {
		//Test
		ConfigurableApplicationContext context = SpringApplication.run(DemohibernateApplication.class, args);
		
		PersonRepository personneRepository = context.getBean(PersonRepository.class); 
		Person p = new Person(); 
		p.setName("Thomas Test");
		
		
		personneRepository.save(p); 
		
		for (Person person : personneRepository.findAll()) {
			System.out.println(person.getName());
		}
		
	}

}
