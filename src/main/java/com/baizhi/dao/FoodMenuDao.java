package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface FoodMenuDao {
    //删除菜谱关系属性
    void delete (Integer menuid);
    //添加菜系属性
    void add(
            @Param("foodid") Integer foodid,
            @Param("menuid") Integer menuid);
}
