package com.baizhi.dao;

import com.baizhi.entity.Food;

import java.util.List;

/**
 * Created by XIXI on 2019/11/1.
 */
public interface FoodDao {
    //查询所有食材
    List<Food> queryAll();
    //添加食材
    void add(String name);
}
