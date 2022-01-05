package com.violatingsolidprinciples;

public interface UserOps {
    boolean login(UserDetails data);
    boolean register(UserDetails data);
    //violation of both single respnsibility and interface segregation
    public void sendmail(UserDetails data);
}
