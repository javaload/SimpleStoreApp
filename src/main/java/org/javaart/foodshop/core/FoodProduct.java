package org.javaart.foodshop.core;

import java.math.BigDecimal;
import org.javaart.foodshop.api.Product;

/**
 * Product implementation 
 */
public class FoodProduct implements Product {

    private String productName;
    private double productId;
    private BigDecimal productPrice;
    private ProductDiscount productDiscount;

    @Override
    public double getId() {
        return productId;
    }

    @Override
    public void setId(double id) {
        productId = id;
    }

    @Override
    public BigDecimal getPrice() {
        return productPrice;
    }

    @Override
    public void setPrice(BigDecimal price) {
        productPrice = price;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public void setProductName(String name) {
        productName = name;
    }

    @Override
    public void setProductDiscount(ProductDiscount productDiscount) {
        this.productDiscount = productDiscount;
    }

    @Override
    public ProductDiscount getProductDiscount() {
        return productDiscount;
    }
}
