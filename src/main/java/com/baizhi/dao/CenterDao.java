package com.baizhi.dao;

import com.baizhi.entity.Center;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface CenterDao {
    //查询我的菜谱
    List<Center> queryById(Integer userid);
    //删除关系属性
    void delete(Integer menuid);
    //查询
    List<Center> queryAll();
    //查询根据菜谱id
    Center queryByCaipuId(
            @Param("menuid") Integer menuid,
            @Param("userid") Integer userid);
    //添加关系属性
    void insertCen(
            @Param("userid") Integer userid,
            @Param("menuid") Integer menuid);


}
