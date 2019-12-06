package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.CenterService;
import com.baizhi.service.MenuService;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by XIXI on 2019/10/31.
 */
public class UserServiceTest extends BaseTset {
    @Autowired
    private UserService userService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private CenterService centerService;

    @Test
    public void test1(){
        User user =userService.find("小三","123456");
        System.out.println(user);
    }

}
