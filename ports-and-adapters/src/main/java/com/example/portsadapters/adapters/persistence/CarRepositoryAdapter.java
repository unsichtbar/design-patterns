package com.example.portsadapters.adapters.persistence;

import com.example.portsadapters.Car;
import com.example.portsadapters.annotations.Adapter;
import com.example.portsadapters.common.LoadCarPort;
import com.example.portsadapters.common.SaveCarPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Adapter
class CarRepositoryAdapter implements SaveCarPort, LoadCarPort {

    private Map<Car.CarId, Car> map;

    @Autowired
    public CarRepositoryAdapter(){
        this.map = new HashMap<>();
    }


    @Override
    public Car save(Car car) {
        return this.map.put(car.getId(), car);
    }

    @Override
    public List<Car> loadCars() {
        return map.values().stream().collect(Collectors.toList());
    }

    @Override
    public Car loadCar(Car.CarId id) {
        return this.map.get(id);
    }
}
