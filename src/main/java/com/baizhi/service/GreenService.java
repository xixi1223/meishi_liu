package com.baizhi.service;

import com.baizhi.entity.Green;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
public interface GreenService {
    List<Green> findAll();
    void addGreen(String name);
}
