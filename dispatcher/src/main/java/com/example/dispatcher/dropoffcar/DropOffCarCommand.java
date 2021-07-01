package com.example.dispatcher.dropoffcar;

import com.example.dispatcher.Car;
import com.example.dispatcher.bus.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DropOffCarCommand implements Command<Car> {

    private String make;
    private String model;
}
