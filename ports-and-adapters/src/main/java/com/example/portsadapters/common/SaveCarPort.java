package com.example.portsadapters.common;

import com.example.portsadapters.Car;
import com.example.portsadapters.annotations.OutputPort;

@OutputPort
public interface SaveCarPort {

    Car save(Car car);
}
