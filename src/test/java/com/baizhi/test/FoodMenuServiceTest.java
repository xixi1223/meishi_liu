package com.baizhi.test;

import com.baizhi.entity.Center;
import com.baizhi.entity.Food;
import com.baizhi.entity.Green;
import com.baizhi.entity.Menu;
import com.baizhi.service.CenterService;
import com.baizhi.service.FoodService;
import com.baizhi.service.GreenService;
import com.baizhi.service.MenuService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public class FoodMenuServiceTest extends BaseTset {
    @Autowired
    private CenterService centerService;

    @Autowired
    private MenuService menuService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private GreenService greenService;

    @Test
    public void test3(){
        List<Center> list=centerService.findById(1);
        System.out.println("11111"+list);
    }

    @Test
    public void test2(){
        List<Menu> list=menuService.queryAllMenu();
        for (Menu d : list) {
            System.out.println(d);
        }
    }
    @Test
    public void test1(){
        Menu menu = menuService.findById(1);
        System.out.println(menu);

    }
    @Test
    public void test4(){
        List<Food> list=foodService.findAll();
        System.out.println(list);
    }
    @Test
    public void test5(){
        List<Green> list=greenService.findAll();
        System.out.println(list);
    }
    @Test
    public void test6(){
        List<Menu> list =menuService.findAllById(1);
        System.out.println(list);
    }

    @Test
    public void test7(){
        List<Center> list =centerService.findAll();
        System.out.println(list);
    }
    @Test
    public void test8(){
        Center list = centerService.findAllByMenuId(1,1);
        System.out.println(list);
    }
}
