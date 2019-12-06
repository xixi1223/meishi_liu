package com.baizhi.service.lmpl;

import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
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

public class MenuServicelmpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> findAllById(Integer id) {
        return menuDao.queryAllById(id);
    }

    @Override
    public void addMenu(Menu menu) {
        menuDao.add(menu);
    }

    @Override
    public Menu findById(Integer id) {
        return menuDao.queryById(id);
    }

    @Override
    public void updateMenu(Menu menu) {
        menuDao.update(menu);
    }

    @Override
    public void deleteById(Integer id) {
        menuDao.delete(id);
    }

    @Override
    public List<Menu> queryAllMenu() {
        return menuDao.queryAll();
    }

    @Override
    public void upCOunt(Integer menuid, Integer count) {
        menuDao.updateCount(menuid,count);
    }
}
