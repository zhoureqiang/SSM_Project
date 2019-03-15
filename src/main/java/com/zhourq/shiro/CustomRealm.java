package com.zhourq.shiro;

import com.zhourq.entity.User;
import com.zhourq.service.system.SystemService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName CustomRealm
 * @Description TODO
 * @Author zhourq
 * @Date 2019/3/12 21:37
 * @Version 1.0
 **/
public class CustomRealm extends AuthorizingRealm {
    @Resource
//    private SystemService systemService;

    // 设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    //认证的方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // token是用户输入的用户名和密码
        // 第一步从token中取出用户名
//        String userCode = (String) authenticationToken.getPrincipal();

        // 第二步：根据用户输入的userCode从数据库查询用户信息
//        User user = null;
//        try {
//            user = systemService.findUserByUserId(userCode);
//        } catch (Exception e1) {
//            e1.printStackTrace();
//        }
//        // 如果查询不到返回null
//        if(user==null){
//            return null;
//        }

        // 从数据库查询到密码
//        String password = user.getPassword();
        //盐
//        String salt = user.getSalt();

        // 如果查询到,返回认证信息AuthenticationInfo
        //activeUser就是用户身份信息
//        ActiveUser activeUser = new ActiveUser();
//        activeUser.setUserid(sysUser.getId());
//        activeUser.setUsercode(sysUser.getUsercode());
//        activeUser.setUsername(sysUser.getUsername());
        //..

        //根据用户id取出菜单
//        List<SysPermission> menus  = null;
//        List<String> menus  = null;
//        try {
//            //通过service取出菜单
//            menus = systemService.findMenuListByUserId(user.getId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //将用户菜单,设置到activeUser
//        activeUser.setMenus(menus);

        //将activeUser设置simpleAuthenticationInfo
//        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
//                activeUser, password, ByteSource.Util.bytes(salt), this.getName());
//        return simpleAuthenticationInfo;
        return null;
    }
}
