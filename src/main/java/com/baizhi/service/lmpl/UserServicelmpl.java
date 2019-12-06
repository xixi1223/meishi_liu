package com.baizhi.service.lmpl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.Menu;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
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
public class UserServicelmpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User find(String name, String pwd) {
        return userDao.query(name,pwd);
    }


}
