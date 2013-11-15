package org.javaart.foodshop.dao;

import java.math.BigDecimal;

import org.javaart.foodshop.api.Product;
import org.javaart.foodshop.api.User;
import org.javaart.foodshop.core.Client;
import org.javaart.foodshop.core.FoodProduct;

public class DummyDAO_Impl implements ApplicationDAO {

	@Override
	public double saveUser(User user) {
		return SUCCESS_STATUS;
	}

	@Override
	public User loadUserById(double id) {
		//DUMMY CLIENT USER
		return createDummyUser();
	}

	@Override
	public User loadUserByLogin(String login) {
		//DUMMY CLIENT USER
		return createDummyUser();
	}

	@Override
	public double saveProduct(Product product) {
		return SUCCESS_STATUS;
	}

	@Override
	public Product loadProductById(double id) {
		return createDummyProduct();
	}

	@Override
	public Product loadProductByName(String name) {
		return createDummyProduct();
	}
	
	private User createDummyUser() {
		User dummy = new Client();
		dummy.setId(123);
		dummy.setName("Ivan");
		dummy.setLogin("ivanslogin");
		dummy.setPassword("pass111");
		dummy.setPhone("1234567");
		dummy.setAddress("dummy adress 1");
		return dummy;
	}
	
	private Product createDummyProduct() {
		Product dummy = new FoodProduct();
		dummy.setId(123);
		dummy.setPrice(new BigDecimal("10.25"));
		dummy.setProductName("dummy product");
		return dummy;
		
	}

}
