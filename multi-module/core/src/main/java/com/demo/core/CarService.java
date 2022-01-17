package com.demo.core;

import com.demo.core.id.IdGen;
import com.demo.core.repositories.CarRepository;
import com.demo.models.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {

    @Autowired
    CarRepository repository;
    @Autowired
    IdGen generator;

    public CarEntity createCar(CreateCarInput input) {
        CarEntity car = new CarEntity(input.getMake(), input.getModel());
        car.setId(generator.generate());
        return repository.save(car);
    }

}
