package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import dmacc.beans.ShoppingList;

@Configuration
public class BeanConfiguration {
	@Bean
	public ShoppingList shoppingList() {
		ShoppingList bean = new ShoppingList("Eric Carle");
		//bean.setName("Dr. Seuss");
		//bean.setPhone("555-555-5555");
		//bean.setRelationship("friend");
		return bean;
	}

}