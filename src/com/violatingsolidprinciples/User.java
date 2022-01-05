package com.violatingsolidprinciples;

import java.util.ArrayList;
public class User implements UserOps {

    ArrayList<UserDetails> list=new ArrayList<>();
    @Override
    public boolean login(UserDetails data) {

        if(data.getUsername().equals("ram") && data.getPassword().equals("1234")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean register(UserDetails data) {
        // if (email is valid) then storing into DB
        list.add(data);
        return true;
    }

    @Override
    public void sendmail(UserDetails data) {
        if(data.getEmail().equals("ram.deepak@gmail.com"))
        {
            System.out.println("mail is sending from this id:"+data.getEmail());
        }
    }
}
