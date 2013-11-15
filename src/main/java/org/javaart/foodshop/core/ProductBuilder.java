package org.javaart.foodshop.core;

import org.javaart.foodshop.api.Product;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: N01-Exist
 * Date: 15.11.13
 * Time: 18:49
 * To change this template use File | Settings | File Templates.
 */
public class ProductBuilder {
    public Product createProduct(String productName,
                                    double productId,
                                    BigDecimal productPrice,
                                    ProductDiscount productDiscount,
                                    Image productImage) throws IllegalArgumentException {
        if (productName.length() > 10){
            throw new IllegalArgumentException("Product Name length exceeded 10 char");
        }
        return new FoodProduct(productName, productId, productPrice, productDiscount, productImage);
    }
}
