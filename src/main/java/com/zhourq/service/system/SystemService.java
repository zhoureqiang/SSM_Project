package com.zhourq.service.system;

import com.zhourq.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName SystemService
 * @Description 系统服务接口
 * @Author zhourq
 * @Date 2019/3/12 22:01
 * @Version 1.0
 **/
public interface SystemService {
    public User findUserByUserId(String id);
    public List<String> findMenuListByUserId(String id);
}
