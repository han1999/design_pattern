package com.hanxiao.pipeline;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;
import lombok.Data;
import sun.plugin2.message.SetChildWindowHandleMessage;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/7/8
 **/

@Data
public class PipelineImpl implements Pipeline {

    private HandlerNode head = new HandlerNode();
    private HandlerNode tail;

    private MyContext context;


    @Override
    public void start() {
        HandlerNode firstHandler = head.getNext();
        if (firstHandler != null) {
            firstHandler.exec(context);
        }
    }

    @Override
    public MyContext getContext() {
        return context;
    }

    @Override
    public void addHead(Handler... handlers) {
        HandlerNode next = head.getNext();
        for (Handler handler : handlers) {
            HandlerNode handlerNode = new HandlerNode();
            handlerNode.setHandler(handler);

            handlerNode.setNext(next);
            next = handlerNode;
        }
        head.setNext(next);
    }

    @Override
    public void addTail(Handler... handlers) {
        HandlerNode node = tail;
        for (Handler handler : handlers) {
            HandlerNode handlerNode = new HandlerNode();
            handlerNode.setHandler(handler);

            node.setNext(handlerNode);
            node = handlerNode;
        }

        tail = node;
    }
}
