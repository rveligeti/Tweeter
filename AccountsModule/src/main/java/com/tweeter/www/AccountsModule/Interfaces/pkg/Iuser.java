package com.tweeter.www.AccountsModule.Interfaces.pkg;

public interface Iuser extends ILoginModel {

    String getFirstName();
    void   setFirstName(String firstName);
    String getLastName();
    void   setLastName(String lastName);
    String getEmailId();
    void   setEmailId(String email);

}
