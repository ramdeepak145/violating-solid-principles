package com.violatingsolidprinciples;

import java.util.ArrayList;

public class OrderHistory implements Order{
    ArrayList<String> list=new ArrayList<String>();
    public ArrayList<String>  custOrder(String newItem)
    {
        list.add(newItem);
        return list;
    }
    public int orderQuantity()
    {
        return list.size();
    }
}
