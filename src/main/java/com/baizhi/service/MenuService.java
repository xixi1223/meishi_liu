package com.baizhi.service;

import com.baizhi.entity.Menu;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface MenuService {
    //查询
    List<Menu> findAllById(Integer id);
    //添加
    void addMenu(Menu menu);
    //查询
    Menu findById(Integer id);
    //更新
    void updateMenu(Menu menu);
    //删除
    void deleteById(Integer id);
    //后台
    List<Menu> queryAllMenu();
    //更新数量
    void upCOunt(Integer menuid,Integer count);
}
