package com.baizhi.service;

import com.baizhi.entity.Food;

import java.util.List;

/**
 * Created by XIXI on 2019/11/1.
 */
public interface FoodService {
    List<Food> findAll();
    void addFood(String name);
}
