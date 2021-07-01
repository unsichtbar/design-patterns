package com.example.dispatcher.bus;

public interface Handler<SubMessage extends Message<ReturnValue> , ReturnValue> {

    ReturnValue handle(SubMessage message);


    Class<SubMessage> link();

}
