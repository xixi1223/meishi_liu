package com.baizhi.service.lmpl;

import com.baizhi.dao.CenterDao;
import com.baizhi.entity.Center;
import com.baizhi.entity.Menu;
import com.baizhi.service.CenterService;
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
public class CenterServicelmpl implements CenterService {
    @Autowired
    private CenterDao centerDao;


    @Override
    public List<Center> findById(Integer userid) {
        return centerDao.queryById(userid) ;
    }

    @Override
    public void deletebyMenuid(Integer menuid) {
        centerDao.delete(menuid);
    }

    @Override
    public void addCen(Integer userid, Integer menuid) {
        centerDao.insertCen(userid,menuid);
    }

    @Override
    public List<Center> findAll() {
        return centerDao.queryAll();
    }

    @Override
    public Center findAllByMenuId(Integer menuid,Integer userid) {
        return centerDao.queryByCaipuId(menuid,userid);
    }

}
