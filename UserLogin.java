package com.violatingsolidprinciples;

public interface UserLogin{
    boolean login(UserDetails data);
    boolean register(UserDetails data);
    //violation of single respnsibility by taking more than one responsibility
    //violation of interface segregation by depending on method it doesn't use
    public String sendMailTo(UserDetails data);
}
