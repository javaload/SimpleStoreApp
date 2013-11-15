package org.javaart.foodshop.api;

import org.javaart.foodshop.core.ProductDiscount;

import java.math.BigDecimal;

public interface Product {
	double getId();
	void setId(double id);

	/**
	 * Note: java.math.BigDecimal is immutable(!). Value can't be changed. To make math operations use .add(), .multiply() etc methods.
	 * They return new(!!!) BigDecimal instance as result In example:
	 *
	 * BigDecimal result = new BigDecimal("10.75"); // result is "10.75". Always use String instead of float, int in constructor!
	 * result.add(new BigDecimal("0.25")); // Wrong! Value still "10.75", result instance value is immutable and can't be changed
	 * result = result.add(new BigDecimal("0.25")); // Correct! Now value will be "11.00". add() method returned new instance and we overrided result with this new instance.
	 * 
	 * @Returns current single product price
	 */
	BigDecimal getPrice();
	
	/**
	 * Set single product price
	 */
	void setPrice(BigDecimal price);
	
	/**
	 * @Returns current product name 
	 */
	String getName();
	
	/**
	 * set product name
	 */
	void setProductName(String name);

    void setProductDiscount(ProductDiscount productDiscount);

    ProductDiscount getProductDiscount();
}
