package org.javaart.foodshop.dao;

import org.javaart.foodshop.api.Product;
import org.javaart.foodshop.api.User;

/**
 * Data Access Object. Operations with database 
 */
public interface ApplicationDAO {
	double SUCCESS_STATUS = 1;
	double FAIL_STATUS = 0;
	
	// USER operations
	double saveUser(User user);
	User loadUserById(double id);
	User loadUserByLogin(String login);
	
	// PRODUCT operations
	double saveProduct(Product product);
	Product loadProductById(double id);
	Product loadProductByName(String name);

	
	
	
}
