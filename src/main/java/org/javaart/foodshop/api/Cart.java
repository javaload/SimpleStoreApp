package org.javaart.foodshop.api;

import java.math.BigDecimal;

public interface Cart {
	BigDecimal getTotalPrice();
	BigDecimal getDiscountAmount();
    BigDecimal discountCalculator();
	void addProducts(Product product, int quantity);
	void removeProducts(double id, int quantity);
	void clean();
}
