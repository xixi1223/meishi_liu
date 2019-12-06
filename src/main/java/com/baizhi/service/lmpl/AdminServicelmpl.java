package com.baizhi.service.lmpl;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XIXI on 2019/11/1.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class AdminServicelmpl implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin find(String name, String pwd) {
        return adminDao.query(name,pwd);
    }
}
