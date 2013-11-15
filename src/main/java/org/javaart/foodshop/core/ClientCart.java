package org.javaart.foodshop.core;

import java.math.BigDecimal;
import java.util.*;

import org.javaart.foodshop.api.Cart;
import org.javaart.foodshop.api.Product;

public class ClientCart implements Cart{
	private Map<Product, Integer> productsMap = new HashMap<Product, Integer>();
    private DiscountCalculator discountCalculator = new DiscountCalculator();
    private PersonalDiscount personalDiscount;
    private double clientId;

//    public ClientCart(DiscountCalculator discountCalculator, double clientId) {
//        this.discountCalculator = discountCalculator;
//        this.clientId = clientId;
//    }

    @Override
    public BigDecimal getTotalPrice() {
        //getprice
        //getdiscount (discountcalculator method call)
        //totalprice = price-discount
        BigDecimal result = new BigDecimal("0.0");
        for (Map.Entry<Product, Integer> mapEntry : productsMap.entrySet()) {
            result = result.add(mapEntry.getKey().getPrice().subtract(discountCalculator.calculateDiscount(mapEntry.getKey())).multiply(new BigDecimal(mapEntry.getValue())));

                    //discountCalculator.calculateDiscount(mapEntry.getKey()).multiply(new BigDecimal(mapEntry.getValue())));
        }

        return result;
    }



    @Override
    public BigDecimal getDiscountAmount() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BigDecimal discountCalculator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addProducts(Product product, int quantity) {
        for (int i=0; i<quantity; i++) {
            productsMap.put(product, quantity);
        }
    }

    @Override
    public void removeProducts(double id, int quantity) {
        for (int i=0; i<quantity; i++)  {
//            if (productsMap.keySet().equals(id)) {
                productsMap.remove(productsMap.containsValue(id));
//            }
        }
    }

    @Override
    public void clean() {
        productsMap.clear();
    }
}
