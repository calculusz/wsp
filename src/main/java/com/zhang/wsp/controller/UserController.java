package com.zhang.wsp.controller;

import com.zhang.wsp.model.User;
import com.zhang.wsp.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * Created by zhang on 2016/11/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
//        log.info("查询所有用户信息");
//        List<User> userList = userService.getAllUser();
//        model.addAttribute("userList",userList);
        return "main";

    }
    @RequestMapping("/liner1.html")
    public String test(HttpServletRequest request,Model model){
        return "success";
    }
}
