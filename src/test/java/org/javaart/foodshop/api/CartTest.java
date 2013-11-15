package org.javaart.foodshop.api;

import junit.framework.Assert;
import org.javaart.foodshop.core.*;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 11/13/13
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class CartTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();
    Client client = new Client();
    Cart clientCart = new ClientCart();

    @org.junit.Test
    public void discountCalculationTest1 () {

        Product apples = new FoodProduct();
        ProductDiscount productDiscount = new ProductDiscount(10.0f);
        apples.setProductDiscount(productDiscount);
        apples.setPrice(new BigDecimal("100.00"));
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.calculateDiscount(apples);
        clientCart.addProducts(apples, 9);

        Assert.assertEquals(new BigDecimal("810.000"), clientCart.getTotalPrice());

    }

    @org.junit.Test
    public void discountCalculationTest2 () {
        Product bananas = new FoodProduct();
        ProductDiscount productDiscount = new ProductDiscount(15.0f);
        bananas.setPrice(new BigDecimal("100.00"));
        bananas.setProductDiscount(productDiscount);

        Product apples = new FoodProduct();
        ProductDiscount productDiscount1 = new ProductDiscount(5.0f);
        apples.setProductDiscount(productDiscount1);
        apples.setPrice(new BigDecimal("100.00"));

        clientCart.addProducts(bananas, 14);
        clientCart.addProducts(apples, 2);

        Assert.assertEquals(new BigDecimal("1380.0000"), clientCart.getTotalPrice());
    }

    @org.junit.Test
    public void discountCalculationTest3 () {
        Product bananas = new FoodProduct();
        ProductDiscount productDiscount = new ProductDiscount(0.0f);
        bananas.setPrice(new BigDecimal("100.00"));
        bananas.setProductDiscount(productDiscount);

        Product apples = new FoodProduct();
        ProductDiscount productDiscount1 = new ProductDiscount(5.0f);
        apples.setProductDiscount(productDiscount1);
        apples.setPrice(new BigDecimal("100.00"));

        clientCart.addProducts(bananas, 1);
        clientCart.addProducts(apples, 10);

        Assert.assertEquals(new BigDecimal("1050.0000"), clientCart.getTotalPrice());
    }

    @org.junit.Test
    public void discountCalculationTest4 () {
        PersonalDiscount personalDiscount = new PersonalDiscount(10.0f);
        client.setPersonalDiscount(personalDiscount);

        Product bananas = new FoodProduct();
        ProductDiscount productDiscount = new ProductDiscount(5.0f);
        bananas.setPrice(new BigDecimal("100.00"));
        bananas.setProductDiscount(productDiscount);

        clientCart.addProducts(bananas, 7);

        Assert.assertEquals(new BigDecimal("630"), clientCart.getTotalPrice());
    }



}
