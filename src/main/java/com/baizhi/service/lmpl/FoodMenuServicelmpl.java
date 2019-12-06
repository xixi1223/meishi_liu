package com.baizhi.service.lmpl;

import com.baizhi.dao.FoodMenuDao;
import com.baizhi.entity.FoodMenu;
import com.baizhi.service.FoodMenuService;
import com.baizhi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class FoodMenuServicelmpl implements FoodMenuService {
    @Autowired
    private FoodMenuDao foodMenuDao;


    @Override
    public void deleteByMenuid(Integer menuid) {
        foodMenuDao.delete(menuid);
    }

    @Override
    public void addFoodMenu(Integer foodid, Integer menuid) {
        foodMenuDao.add(foodid,menuid);
    }

}
