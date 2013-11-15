package org.javaart.foodshop.core;

import org.javaart.foodshop.api.DiscountRule;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 11/12/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonalDiscount extends DiscountRule {

    public PersonalDiscount(float percentage) {
        super(percentage);
    }

}
