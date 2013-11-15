package org.javaart.foodshop;

import org.javaart.foodshop.api.Product;
import org.javaart.foodshop.api.User;
import org.javaart.foodshop.dao.ApplicationDAO;
import org.javaart.foodshop.dao.DummyDAO_Impl;

public class Main {

	public static void main(String[] args) {
		ApplicationDAO dao = new DummyDAO_Impl();
		User dummyUser = dao.loadUserByLogin("any string 1234");
		System.out.println("Dummy user name: " + dummyUser.getName() + " Adress: " + dummyUser.getAddress());
		Product dummyProduct = dao.loadProductByName("any string 4321");
		System.out.println("Dummy product name: " + dummyProduct.getName() + " Price: " + dummyProduct.getPrice());
	}

}
