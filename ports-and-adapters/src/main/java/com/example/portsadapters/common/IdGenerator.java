package com.example.portsadapters.common;

import com.example.portsadapters.annotations.OutputPort;

@OutputPort
public interface IdGenerator {

    long generate();
}
