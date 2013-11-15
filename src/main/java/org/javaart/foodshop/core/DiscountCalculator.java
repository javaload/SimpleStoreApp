package org.javaart.foodshop.core;

import org.javaart.foodshop.api.Product;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 11/13/13
 * Time: 11:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class DiscountCalculator {

    //TODO Has to be singleton
    //TODO implement discount logic

    public BigDecimal calculateDiscount (Product product) {
        float productDiscountPercentage = product.getProductDiscount().getPercentage();
//        TODO
//        float userDiscountPercentage;
//        float bulkDiscountPercentage;
        BigDecimal productPrice = product.getPrice();
        BigDecimal result = new BigDecimal("0.0");
        if (product.getProductDiscount().getPercentage()!=0) {
            result = productPrice.multiply(new BigDecimal(Float.toString(productDiscountPercentage / 100)));
            return result;
        } else {
            return result;
        }

    }


}
