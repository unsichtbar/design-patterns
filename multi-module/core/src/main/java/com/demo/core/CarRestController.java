package com.demo.core;

import com.demo.core.repositories.CarRepository;
import com.demo.models.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarRestController {

    @Autowired
    CarRepository carRepository;


    @GetMapping
    public ResponseEntity<List<CarEntity>> getCars(){
        return ResponseEntity.ok(carRepository.findAll());
    }
}
