package com.zhourq.controller;

import com.zhourq.dao.MessageMapper;
import com.zhourq.entity.Message;
import com.zhourq.entity.User;
import com.zhourq.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName LoginController
 * @Description TODO
 * @Author zhourq
 * @Date 2019/3/9 14:41
 * @Version 1.0
 **/
@RequestMapping("/login")
@Controller
public class TestController {
    @Resource
    private SystemService systemService;

    @RequestMapping("/login")
    public ModelAndView toLoginPage(){
        ModelAndView mv = new ModelAndView("login");
//        User user = (User) systemService.findMenuListByUserId("haha");
//        mv.addObject("msg",user);
        System.out.println("hello world");
        return mv;
    }
}
