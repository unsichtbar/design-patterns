package com.example.dispatcher.common;

import com.example.dispatcher.Car;

import java.util.List;

public interface LoadCarPort {

    List<Car> loadCars();
    Car loadCar(Car.CarId id);
}
