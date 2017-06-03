package org.csu.blog.domain;

import org.springframework.context.annotation.Bean;

import javax.annotation.Generated;
import javax.annotation.Resource;

/**
 * Created by lixiang on 2017 06 03 下午4:53.
 */
public class Account {

    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
