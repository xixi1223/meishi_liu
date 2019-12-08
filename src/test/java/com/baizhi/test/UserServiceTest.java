package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.CenterService;
import com.baizhi.service.FoodService;
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
    @Autowired
    private FoodService foodService;

    @Test
    public void test1(){
        User user =userService.find("小三","123456");
        System.out.println(user);
    }
    //添加食材
    @Test
    public void test2(){
        foodService.addFood("嘿嘿黑");
        System.out.println("添加成功！");
    }

}
