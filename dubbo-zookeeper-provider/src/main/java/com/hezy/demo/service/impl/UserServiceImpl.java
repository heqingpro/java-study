package com.hezy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hezy.demo.entity.User;
import com.hezy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;


/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/18 19:13
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Value("${server.port}")
    private int port;

    @Override
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("shenniu" + i);
            user.setPwd("端口：" + port);
            list.add(user);
        }
        return list;
    }

}
