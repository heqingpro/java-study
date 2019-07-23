package com.example.websocketserver.controller;

import com.example.websocketserver.service.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/22 17:14
 */
@RestController
public class WebSocketController {

    @Autowired
    WebSocketServer server;
    @PostMapping("/login")
    public String login(String username,String password) throws IOException {
        //TODO: 校验密码
        server.sendInfo(username + "进入了聊天室!");
        return username;
    }
}
