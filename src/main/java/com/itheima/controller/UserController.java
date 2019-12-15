package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String querAll(Model model) {
        List<User> userList = userService.queryAll();
        model.addAttribute("userlist", userList);
        return "list";
    }


    /***
     * 保存一个用户
     * @return
     */
    @RequestMapping("/save")
    public String save() {
        return null;
    }
}
