package com.xiong.www.controller;

import com.xiong.www.po.UserEntity;
import com.xiong.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    /*
    * Desc:用户信息控制器
    * */
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllUsers() {
        List<UserEntity> userlist = userService.getAllUsers();
        return userlist;
    }

}
