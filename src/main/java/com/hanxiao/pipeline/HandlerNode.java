package com.hanxiao.pipeline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

@Data
public class HandlerNode {
    private Handler handler;
    private HandlerNode next;

    void exec(MyContext context) {
        Boolean ret = handler.handle(context);
        if (ret) {
            if (next != null) {
                next.exec(context);
            }
        }
    }
}
