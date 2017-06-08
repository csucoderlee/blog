package org.csu.blog.controller;

import org.csu.blog.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiang on 2017 06 03 下午4:09.
 */

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/login")
    public Object login(String username, String password) {
        return accountService.login(username, password);

    }
}
