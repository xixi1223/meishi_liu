package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * Created by XIXI on 2019/11/1.
 */
public interface AdminDao {
    Admin query(
            @Param("name") String name,
            @Param("pwd") String pwd);
}
