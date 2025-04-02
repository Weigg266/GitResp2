package com.wd.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wd.pojo.User;
import com.wd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: weigj
 * @Date: 2025/4/2 - 04 - 02 - 15:53
 * @Description: com.wd.controller
 * @version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryAll")
    @ResponseBody
    public List<User> queryAll(){
         return userService.list();
    }
}
