package com.violatingsolidprinciples;

public class FiveYearSubscription extends SubscriptionPlans{
    public FiveYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }

    public int getSubscriptionPrice()
    {
        return 15000-(15000*discount()/100);
    }
}
