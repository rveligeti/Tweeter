package com.tweeter.www.AccountsModule.Interfaces.pkg;

public interface IAccountsRepository {

    void Init();

    Boolean Save(Iuser user);

    Boolean update(Iuser user);

    Boolean delete(Iuser user);

}
