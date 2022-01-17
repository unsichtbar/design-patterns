package com.demo.core.repositories;

import com.demo.models.CarEntity;

import java.util.List;

public interface CarRepository {

    CarEntity save(CarEntity car);

    List<CarEntity> findAll();
}
