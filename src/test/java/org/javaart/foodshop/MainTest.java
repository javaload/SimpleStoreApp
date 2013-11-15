package org.javaart.foodshop;

import org.javaart.foodshop.api.Cart;
import org.javaart.foodshop.api.Product;
import org.javaart.foodshop.core.ClientCart;
import org.javaart.foodshop.dao.ApplicationDAO;
import org.javaart.foodshop.dao.DummyDAO_Impl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 11/11/13
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    @Test
    public void cartTest() {
        ApplicationDAO dao = new DummyDAO_Impl();
        Product dummyProduct = dao.loadProductByName("any string 4321");
        Cart cart = new ClientCart();
        cart.addProducts(dummyProduct, 100); // add 100 dummy products to cart
        cart.removeProducts(dummyProduct.getId(), 5); // minus 5 dummy products from cart
        BigDecimal expectedTotalPrice = dummyProduct.getPrice().multiply(new BigDecimal("95")); // we expect 95 dummy products in cart

        System.out.println("Cart total price = " + cart.getTotalPrice() + " , Expected total price = " + expectedTotalPrice);
    }

}
