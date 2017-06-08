package org.csu.blog.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.csu.blog.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2017 06 03 下午4:52.
 */

@Mapper
public interface AccountMapper {

    Account findByUsername(@Param("username") String username, @Param("password") String password);
}
