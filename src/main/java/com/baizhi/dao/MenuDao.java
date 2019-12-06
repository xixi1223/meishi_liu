package com.baizhi.dao;

import com.baizhi.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface MenuDao {
    //查询所有菜谱
    List<Menu> queryAllById(Integer id);
    //添加
    void add(Menu menu);
    //查询
    Menu queryById(Integer id);
    //更新
    void update(Menu menu);
    //删除
    void delete(Integer id);
    //后台查询所有菜谱
    List<Menu> queryAll();
    //更新数量
    void updateCount(
            @Param("menuid") Integer menuid,
            @Param("count") Integer count);
}
