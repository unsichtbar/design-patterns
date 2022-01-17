package com.demo.repositories;

import com.demo.core.repositories.CarRepository;
import com.demo.models.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarRepositoryImpl implements CarRepository {

    @Autowired
    private CarJpaRepository repository;

    @Override
    public CarEntity save(CarEntity car) {
        return repository.save(car);
    }

    @Override
    public List<CarEntity> findAll() {
        return repository.findAll();
    }
}
