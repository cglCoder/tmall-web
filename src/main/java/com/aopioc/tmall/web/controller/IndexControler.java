package com.aopioc.tmall.web.controller;

import com.aopioc.tmall.web.controller.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称 : tmall-web
 * 包名 : com.aopioc.tmall.web.controller
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/10/29 1:02
 */
@RestController
@RequestMapping("/index")
public class IndexControler {

    @RequestMapping("/1")
    public User getUserInfo(){
        User user =new User();
        user.setName("王伟");
        user.setAge(19);
        return user;
    }




}
