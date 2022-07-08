package com.hanxiao.pipeline;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

public class Handler1 implements Handler {

    @Override
    public Boolean handle(MyContext context) {
        System.out.println("Handler1.handle");
        return true;
    }
}
