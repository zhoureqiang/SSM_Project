package com.zhourq.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName Job
 * @Description quartz定时任务
 * @Author zhourq
 * @Date 2018/12/24 14:17
 * @Version 1.0
 **/
@Component
public class Job {
    @Scheduled(cron = "*/10 * * * * ?")//设置时间间隔，当前为每10秒执行一次
    public void run() {
        System.out.println("Hello quartz! 1 now ->" + new Date());
    }

//    private void open() {
//    }
}
