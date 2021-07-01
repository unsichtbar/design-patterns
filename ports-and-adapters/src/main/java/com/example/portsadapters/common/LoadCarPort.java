package com.example.portsadapters.common;

import com.example.portsadapters.Car;
import com.example.portsadapters.annotations.OutputPort;

import java.util.List;

@OutputPort
public interface LoadCarPort {

    List<Car> loadCars();
    Car loadCar(Car.CarId id);
}
