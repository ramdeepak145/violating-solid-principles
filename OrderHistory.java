package com.violatingsolidprinciples;

import java.util.ArrayList;

public class OrderHistory implements Order{
    ArrayList<Order> list=new ArrayList<Order>();
    public ArrayList<Order>  custOrder(Order newitem)
    {
        list.add(newitem);
        return list;
    }
    public int orderQuantity(OrderHistory history)
    {
        return history.list.size();
    }
}
