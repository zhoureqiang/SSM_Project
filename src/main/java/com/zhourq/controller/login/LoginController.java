package com.zhourq.controller.login;

import com.zhourq.exception.CustomException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName LoginController
 * @Description TODO
 * @Author zhourq
 * @Date 2019/3/12 22:57
 * @Version 1.0
 **/
@Controller
public class LoginController {
    //loginUrl指定的认证提交地址
    @RequestMapping("/login")
    public String login(HttpServletRequest request) throws Exception{

        //如果登陆失败，则从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName=request.getParameter("shiroLoginFailure");
        //根据shiro返回的异常路径判断，抛出指定异常信息
        if(exceptionClassName!=null){
            if(UnknownAccountException.class.getName().equals(exceptionClassName)){
                throw new CustomException("账户不存在");
            }else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)){
                throw new CustomException("用户名/密码错误");
            }else{
                throw new Exception();
            }
        }
        //此方法不处理登陆成功(认证成功)，如果shiro认证成功会自动跳转到上一个请求路径。
        //登陆失败回到login页面：
        return "login";
    }

    @RequestMapping("/first.action")
    public String first(Model model)throws Exception{

        //从shiro的session中取activeUser
        Subject subject = SecurityUtils.getSubject();
        //取身份信息
//        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //通过model传到页面
//        model.addAttribute("activeUser", activeUser);

        return "/first";
    }


}
