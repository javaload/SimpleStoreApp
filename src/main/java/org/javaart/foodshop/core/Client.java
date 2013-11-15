package org.javaart.foodshop.core;

import org.javaart.foodshop.api.User;

/**
 * Shop client. Client specific logic can go here
 */
public class Client extends User {

    private PersonalDiscount personalDiscount;

    public PersonalDiscount getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(PersonalDiscount personalDiscount) {
        this.personalDiscount = personalDiscount;
    }

}
