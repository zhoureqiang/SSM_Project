package com.zhourq.impl;

import com.zhourq.dao.MessageMapper;
import com.zhourq.entity.User;
import com.zhourq.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName SystemServiceImpl
 * @Description TODO
 * @Author zhourq
 * @Date 2019/3/12 23:14
 * @Version 1.0
 **/
@Service("systemService")
public class SystemServiceImpl implements SystemService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public User findUserByUserId(String id) {
        return null;
    }

    @Override
    public List<String> findMenuListByUserId(String id) {
        return null;
    }
}
