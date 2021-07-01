package com.example.dispatcher.adapters.idgen;

import com.example.dispatcher.common.IdGenerator;
import org.springframework.stereotype.Component;

@Component
class IdGenAdapter implements IdGenerator {

    Snowflake snowflake;


    public IdGenAdapter(){
        snowflake = new Snowflake(275);
    }


    @Override
    public long generate() {
        return snowflake.nextId();
    }
}
