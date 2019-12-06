package com.baizhi.service;

import com.baizhi.entity.User;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface UserService {
    //登录
    User find(String name, String pwd);

}
