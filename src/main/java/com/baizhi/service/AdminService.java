package com.baizhi.service;

import com.baizhi.entity.Admin;

/**
 * Created by XIXI on 2019/11/1.
 */
public interface AdminService {
    Admin find(String name,String pwd);
}
