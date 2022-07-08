package com.hanxiao.pipeline;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

public interface Handler {
    Boolean handle(MyContext context);
}
