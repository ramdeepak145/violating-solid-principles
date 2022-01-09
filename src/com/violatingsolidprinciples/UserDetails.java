package com.violatingsolidprinciples;

public class UserDetails {
    private String email,password,userName,phoneNumber;

    public UserDetails(String email,  String userName,String password,String phoneNumber) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.phoneNumber=phoneNumber;
    }
    public UserDetails(){};

    public UserDetails( String userName,String password) {
        this.password = password;
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getphoneNum()
    {
        return phoneNumber;
    }
    public void setphoneNum(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
}
