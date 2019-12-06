package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by XIXI on 2019/10/31.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userlogin")
    public String queryAll(String name, String pwd, HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= userService.find(name,pwd);
        session.setAttribute("id",user.getId());
        session.setAttribute("name",name);
        if(user!=null){
            return "redirect:/green/greAll";
        }else {
            return "redirect:front/login.jsp";
        }
    }

}
