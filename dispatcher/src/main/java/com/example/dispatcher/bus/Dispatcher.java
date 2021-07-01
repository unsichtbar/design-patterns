package com.example.dispatcher.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface Dispatcher {

    <ReturnType> CompletableFuture<ReturnType> dispatch(Message<ReturnType> message);


    @Component
    class DispatcherImpl implements Dispatcher {

        private Map<Class, Handler> handlers;


        @Autowired
        public DispatcherImpl(List<Handler> handlers) {
            this.handlers = new HashMap<>();
            handlers.forEach(handler -> this.handlers.put(handler.link(), handler));
        }


        @Override
        public <ReturnType> CompletableFuture<ReturnType> dispatch(Message<ReturnType> message) {
            CompletableFuture<ReturnType> future = (CompletableFuture<ReturnType>) CompletableFuture.supplyAsync(() -> this.handlers.get(message.getClass()).handle(message));

            return future;
        }
    }

}
