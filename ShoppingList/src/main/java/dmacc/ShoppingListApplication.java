package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.ShoppingList;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ShoppingListReposity;

@SpringBootApplication
public class ShoppingListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingListApplication.class, args);

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		ShoppingList c = appContext.getBean("shoppingList", ShoppingList.class);
		System.out.println(c.toString());
	}

	@Autowired
	ShoppingListReposity repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// using an existing bean
		ShoppingList c = appContext.getBean("shoppingList", ShoppingList.class);
		c.setStore("Target");
		repo.save(c);

		// creating a bean to use not managed by Spring
		ShoppingList d = new ShoppingList("Target", "(lotion,toilet paper,food)", "Scotty");
		repo.save(d);
		List<ShoppingList> allMyContacts = repo.findAll();
		for (ShoppingList list : allMyContacts) {
			System.out.println(list.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
