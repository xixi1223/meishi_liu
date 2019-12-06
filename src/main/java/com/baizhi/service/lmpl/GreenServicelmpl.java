package com.baizhi.service.lmpl;

import com.baizhi.dao.GreenDao;
import com.baizhi.entity.Green;
import com.baizhi.service.GreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service
public class GreenServicelmpl implements GreenService {
    @Autowired
    private GreenDao greenDao;

    @Override
    public List<Green> findAll() {
        return greenDao.queryAll();
    }

    @Override
    public void addGreen(String name) {
        greenDao.add(name);
    }
}