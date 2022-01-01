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
        OrderHistory obj2=new OrderHistory();
        obj2.custOrder("books");
        obj2.custOrder("rice");
        System.out.println(obj2.custOrder("laptop"));
        System.out.println(obj2.orderQuantity());
        Invoice obj3=new Invoice(obj2);
        System.out.println("Orderlist Bill is  : "+obj3.bill());
    }
}
