package org.csu.blog.service.impl;

import org.csu.blog.dao.mybatis.AccountMapper;
import org.csu.blog.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lixiang on 2017 06 03 下午4:57.
 */

@Service
public class AccountService implements IAccountService {

    @Resource
    AccountMapper accountMapper;

    @Override
    public void login(String username, String password) {
        accountMapper.findByUsername(username, password);
    }
}
