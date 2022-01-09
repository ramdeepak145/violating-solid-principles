package com.violatingsolidprinciples;

public class OneYearSubscription extends SubscriptionPlans {

    public OneYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }
    //violation of Liskov Substution (here OneYearSubscription cannot replace SubscriptionPlans
    // because discount() method is not used)
    public int getSubscriptionPrice()
    {
        return 10000;
    }

}
