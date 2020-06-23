package com.tweeter.www.AccountsModule.AccountsRepo.pkg;

import com.tweeter.www.AccountsModule.Interfaces.pkg.IAccountsRepository;
import com.tweeter.www.AccountsModule.Interfaces.pkg.Iuser;
import org.springframework.stereotype.Service;


@Service
public class AccountsRepository implements IAccountsRepository {


    @Override
    public void Init() {

    }

    @Override
    public Boolean Save(Iuser user) {
        return Boolean.TRUE;
    }

    @Override
    public Boolean update(Iuser user) {
        return Boolean.TRUE;
    }

    @Override
    public Boolean delete(Iuser user) {
        return Boolean.TRUE;
    }
}
