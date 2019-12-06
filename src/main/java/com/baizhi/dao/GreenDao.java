package com.baizhi.dao;

import com.baizhi.entity.Green;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface GreenDao {
    //查询所有菜系
    List<Green> queryAll();
    //添加
    void add(String name);
}
