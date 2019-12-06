package com.baizhi.service.lmpl;

import com.baizhi.dao.FoodDao;
import com.baizhi.entity.Food;
import com.baizhi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by XIXI on 2019/11/1.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class FoodServicelmpl implements FoodService {
    @Autowired
    private FoodDao foodDao;

    @Override
    public List<Food> findAll() {
        return foodDao.queryAll();
    }

    @Override
    public void addFood(String name) {
        foodDao.add(name);
    }
}
