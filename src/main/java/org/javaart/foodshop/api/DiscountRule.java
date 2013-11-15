package org.javaart.foodshop.api;

public abstract class DiscountRule {

    private float percentage;

    protected DiscountRule(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

}
