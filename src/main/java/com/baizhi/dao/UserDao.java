package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface UserDao {
    //登录
    User query(
            @Param("username") String username,
            @Param("password") String password);

}
