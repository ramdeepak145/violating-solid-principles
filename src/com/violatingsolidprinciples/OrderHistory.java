package com.violatingsolidprinciples;

import java.util.ArrayList;

public class OrderHistory implements Order{
    ArrayList<Order> list=new ArrayList<Order>();
    public ArrayList<Order>  custOrder(Order newItem)
    {
        list.add(newItem);
        return list;
    }
    public int orderQuantity(OrderHistory history)
    {
        return history.list.size();
    }
}
