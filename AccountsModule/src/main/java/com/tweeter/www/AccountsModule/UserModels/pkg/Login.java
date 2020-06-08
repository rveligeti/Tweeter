package com.tweeter.www.AccountsModule.UserModels.pkg;

import com.tweeter.www.AccountsModule.Interfaces.pkg.ILoginModel;

public class Login implements ILoginModel{
    private String userID;
    private String password;

    public String getUserId() {
        return this.userID;
    }

    public void setUserId(String userId) {
          this.userID=userId;

    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
            this.password=password;
    }

}
