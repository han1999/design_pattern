package com.hanxiao.pipeline;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

public class Handler2 implements Handler {

    @Override
    public Boolean handle(MyContext context) {
        System.out.println("Handler2.handle");
        return true;
    }
}
