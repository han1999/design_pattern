package com.hanxiao.pipeline;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

public class Handler3 implements Handler {

    @Override
    public Boolean handle(MyContext context) {
        System.out.println("Handler3.handle");
        return true;
    }
}
