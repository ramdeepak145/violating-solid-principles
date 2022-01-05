package com.violatingsolidprinciples;

public class OneYearSubscription extends SubscriptionPlans {

    public OneYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }

    //Violates Open closed
    public int getSubscriptionPrice()
    {
        return 10000;
    }

}
