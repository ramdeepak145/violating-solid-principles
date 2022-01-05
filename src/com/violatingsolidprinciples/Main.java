package com.violatingsolidprinciples;

public class Main {

    public static void main(String[] args) {

        User userobj=new User();
        userobj.register(new UserDetails("ram.deepak@gmail.com","ram","1234","8179967489"));
        if(userobj.login(new UserDetails("ram","1234"))) {
            System.out.println("Login successfull");
        }
        else
        {
            System.out.println("Login failed");

        }
        OrderHistory historyobj=new OrderHistory();
        Order orderobj=new OrderHistory();
        historyobj.custOrder(orderobj);
        historyobj.custOrder(orderobj);
        System.out.println(historyobj.custOrder(orderobj));
        System.out.println(orderobj.orderQuantity(historyobj));
        Invoice invoiceobj=new Invoice(historyobj);
        SubscriptionPlans plan=new FiveYearSubscription(18733145,"Fiveyearsplan");
        System.out.println("User's Subscription price discount is: "+plan.discount());
        System.out.println("Orderlist Bill is  : "+invoiceobj.bill());
    }
}
