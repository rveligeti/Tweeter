package com.tweeter.www.AccountsModule.Controller.pkg;

import com.tweeter.www.AccountsModule.Interfaces.pkg.IAccountsRepository;
import com.tweeter.www.AccountsModule.Interfaces.pkg.Iuser;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class AccountsController {

//    private final IAccountsRepository repo;

//
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public void CreateAccount(@RequestBody Iuser user,HttpServletResponse response){
//        repo.Save(user);
        response.setStatus(ExpiresFilter.XHttpServletResponse.SC_CREATED);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public void DeleteAccount(@RequestBody Iuser user,HttpServletResponse response){
        response.setStatus(ExpiresFilter.XHttpServletResponse.SC_ACCEPTED);
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public void updateAccount(HttpServletResponse response){
        response.setStatus(ExpiresFilter.XHttpServletResponse.SC_ACCEPTED);
    }

}
