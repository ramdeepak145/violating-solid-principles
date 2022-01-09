package com.violatingsolidprinciples;

import java.util.Random;

public class Invoice {
    public OrderHistory order;
    Random ran=new Random();
    public Invoice(OrderHistory order)
    {
        this.order=order;
    }
    public Integer bill()
    {
        int total= ran.nextInt(1000) * order.orderQuantity(order);
        return total;
    }
}
