package com.hanxiao.pipeline;

import java.nio.channels.Pipe;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

public class PipelineMain {
    public static void main(String[] args) {
        PipelineImpl pipeline = new PipelineImpl();
        pipeline.setContext(new MyContext("hello"));


        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        pipeline.addHead(handler1, handler2, handler3);

        pipeline.start();
    }
}
