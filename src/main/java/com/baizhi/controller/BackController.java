package com.baizhi.controller;

import com.baizhi.entity.*;
import com.baizhi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by XIXI on 2019/11/1.
 */
@Controller
@RequestMapping("back")
public class BackController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private GreenService greenService;
    @Autowired
    private FoodMenuService foodMenuService;
    @Autowired
    private CenterService centerService;


    @RequestMapping("login")
    public String login(String name,String pwd){
        Admin admin=adminService.find(name,pwd);
        if(admin!=null){
            return "redirect:/back/greenAll";
        }else{
            return "redirect:/back/login.jsp";
        }
    }

    @RequestMapping("greenAll")
    public String queryAll(Model model){
        List<Menu> list= menuService.queryAllMenu();
        model.addAttribute("list", list);
        return "/back/greenlist";
    }
    @RequestMapping("showupdate")
    public String showupdate(Integer id,Model model){
        Menu menu = menuService.findById(id);
        model.addAttribute("menu",menu);
        return "/back/update";
    }
    @RequestMapping("green")
    @ResponseBody
    public List<Green> querygreen(){
        return greenService.findAll();
    }

    @RequestMapping("findAllFood")
    @ResponseBody
    public List<Food> query(){
        return foodService.findAll();
    }

    @RequestMapping("add")
    public String add(Menu menu, Integer[] foodss, Model model, HttpServletRequest request, MultipartFile picc) throws IOException {
        menu.setId((int) (Math.random()*100+1));
        String path=request.getSession().getServletContext().getRealPath("/imgs");
        menu.setPic(picc.getOriginalFilename());
        picc.transferTo(new File(path,menu.getPic()));
        System.out.println(menu);
        menuService.addMenu(menu);
        for (int i=0;i<foodss.length;i++){
           foodMenuService.addFoodMenu(foodss[i],menu.getId());
        }
        return "redirect:/back/greenAll";
    }
    @RequestMapping("delete")
    public String deleteMenu(Integer menuid,HttpServletRequest request){
        Integer userid = (Integer) request.getSession().getAttribute("id");
        List<Center> list = centerService.findById(userid);
        for (Center c : list) {
            if(c.getId()==menuid){
                centerService.deletebyMenuid(menuid);
            }
        }
        foodMenuService.deleteByMenuid(menuid);
        menuService.deleteById(menuid);
        return "redirect:/back/greenAll";
    }

    @RequestMapping("updateMenu")
    public String updateMenu(Menu menu,Integer[] foodss,MultipartFile picc,HttpServletRequest request) throws IOException {
        String path=request.getSession().getServletContext().getRealPath("/imgs");
        picc.transferTo(new File(path,picc.getOriginalFilename()));
        menu.setPic(picc.getOriginalFilename());
        menuService.updateMenu(menu);
        foodMenuService.deleteByMenuid(menu.getId());
        for(int i=0;i<foodss.length;i++){
            foodMenuService.addFoodMenu(foodss[i],menu.getId());
        }
        return "redirect:/back/greenAll";
    }

}
