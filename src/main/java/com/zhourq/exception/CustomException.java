package com.zhourq.exception;

/**
 * Copyright (C) 2018 思创数码科技股份有限公司
 * <p>
 * 版权所有。
 * <p>
 *
 * @ClassName CustomException
 * @Description TODO
 * @Author zhourq
 * @Date 2019/3/12 22:59
 * @Version 1.0
 **/
public class CustomException extends Exception {

    public CustomException(){

    }
    public CustomException(String Message){
        super(Message);

    }

}
