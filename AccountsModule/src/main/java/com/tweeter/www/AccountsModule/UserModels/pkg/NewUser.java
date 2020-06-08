package com.tweeter.www.AccountsModule.UserModels.pkg;

import com.tweeter.www.AccountsModule.Interfaces.pkg.Iuser;

public class NewUser implements Iuser {

    private String firstName;
    private String lastName;
    private String emailId;
    private String userId;
    private String password;

    public String getFirstName() {
        return  firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String email) {
        this.emailId=email;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
            this.userId=userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password=password;
    }
}
