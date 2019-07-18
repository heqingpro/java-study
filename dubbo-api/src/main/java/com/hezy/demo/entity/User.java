package com.hezy.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/18 19:10
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -8351093923760691114L;

    private String name;

    private String pwd;
}
