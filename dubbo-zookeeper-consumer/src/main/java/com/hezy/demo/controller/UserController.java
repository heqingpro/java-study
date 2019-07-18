package com.hezy.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hezy.demo.entity.User;
import com.hezy.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/18 18:54
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    public UserService userService;

    @RequestMapping("/users")
    public List<User> getUsers(){

        return userService.getUsers();
    }
}
