package com.hanxiao.pipeline;

/**
 * @description:
 * @author: hanxiao
 * @date: 2022/7/8
 **/
public interface Pipeline {
    void start();

    MyContext getContext();

    void addHead(Handler... handlers);

    void addTail(Handler... handlers);

}
