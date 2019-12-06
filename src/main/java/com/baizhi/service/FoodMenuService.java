package com.baizhi.service;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface FoodMenuService {

    void deleteByMenuid(Integer menuid);
    void addFoodMenu(Integer foodid,Integer menuid);

}
