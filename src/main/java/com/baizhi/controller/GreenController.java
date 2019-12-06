package com.baizhi.controller;

import com.baizhi.entity.Center;
import com.baizhi.entity.Green;
import com.baizhi.entity.Menu;
import com.baizhi.service.CenterService;
import com.baizhi.service.GreenService;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by XIXI on 2019/11/1.
 */
@Controller
@RequestMapping("green")
public class GreenController {
    @Autowired
    private GreenService greenService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private CenterService centerService;

    @RequestMapping("greAll")
    public String queryAll(HttpServletRequest request){
        HttpSession session=request.getSession();
        List<Green> list=greenService.findAll();
        session.setAttribute("list",list);
        session.setAttribute("username",session.getAttribute("name"));
        return "/front/greenlist";
    }
    @RequestMapping("add")
    public String add(String name){
        greenService.addGreen(name);
        return "redirect:/green/greAll";
    }
    //展示菜系下的菜谱
    @RequestMapping("queryByid")
    public String queryById(Integer id, Model model,HttpServletRequest request){
        request.getSession().setAttribute("caiid",id);
        List<Menu> list=menuService.findAllById(id);
        model.addAttribute("list",list);
        return "/front/menulist";
    }
    //我的菜谱
    @RequestMapping("queryByuserid")
    public String myCai(Model model,HttpServletRequest request){
        Integer id = (Integer) request.getSession().getAttribute("id");
        String username = (String) request.getSession().getAttribute("name");
        List<Center> list=centerService.findById(id);
        model.addAttribute("username", username);
        model.addAttribute("list", list);
        return "/front/mygreen";
    }

    @RequestMapping("count")
    public String count(Integer cid,HttpServletRequest request){
        //获取菜系id
        Integer caiId = (Integer) request.getSession().getAttribute("caiid");
        //获取当前用户id
        Integer userid = (Integer) request.getSession().getAttribute("id");
        Center list1=centerService.findAllByMenuId(cid,userid);
        Integer count=menuService.findById(cid).getRcount();
        if(list1==null){
            centerService.addCen(userid,cid);
            menuService.upCOunt(cid,1);
        }
        List<Menu> list=menuService.findAllById(caiId);
        request.getSession().setAttribute("list",list);
        return "/front/menulist";
    }

}


