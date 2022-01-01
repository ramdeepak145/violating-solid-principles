package com.violatingsolidprinciples;

public abstract class SubscriptionPlans{
    int subscriptionId;
    String subscriptionDetails;
    public SubscriptionPlans(int subscriptionId, String subscriptionDetails)
    {
        this.subscriptionId=subscriptionId;
        this.subscriptionDetails=subscriptionDetails;
    }
    //Violates Liskov principles
    public int discount()
    {
        System.out.println("10% discount for subscribers paying above 14000");
        return 10;
    }
}
