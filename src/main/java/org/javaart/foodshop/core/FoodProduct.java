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
    private Image productImage;

/////////////////
// CONSTRUCTORS
/////////////////

    public FoodProduct(String productName, double productId, BigDecimal productPrice, ProductDiscount productDiscount, Image productImage) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
        this.productImage = productImage;
    }

    // Default
    public FoodProduct() {
        //To change body of created methods use File | Settings | File Templates.
    }


/////////////////
// METHODS
/////////////////


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

    @Override
    public Image getProductImage() {
        return productImage;
    }

    @Override
    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }
}
