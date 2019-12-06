package com.baizhi.service;

import com.baizhi.entity.Center;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface CenterService {
    //查询我的菜谱
    List<Center> findById(Integer userid);
    //删除关系属性
    void deletebyMenuid( Integer menuid);
    //添加
    void addCen(Integer userid,Integer menuid);
    //查询所有
    List<Center> findAll();
    //根据id查询
    Center findAllByMenuId(Integer menuid,Integer userid);
}