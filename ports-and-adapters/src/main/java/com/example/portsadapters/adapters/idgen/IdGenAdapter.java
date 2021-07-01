package com.example.portsadapters.adapters.idgen;

import com.example.portsadapters.annotations.Adapter;
import com.example.portsadapters.common.IdGenerator;
import org.springframework.stereotype.Component;

@Component
@Adapter
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
