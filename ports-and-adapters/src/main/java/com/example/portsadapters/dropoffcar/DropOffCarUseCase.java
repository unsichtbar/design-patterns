package com.example.portsadapters.dropoffcar;

import com.example.portsadapters.Car;
import com.example.portsadapters.annotations.InputPort;
import lombok.AllArgsConstructor;
import lombok.Getter;

@InputPort
public interface DropOffCarUseCase {

    Car dropOffCar(DropOffCarInput input);

    @AllArgsConstructor
    @Getter
    class DropOffCarInput {

        private String make;
        private String model;
    }

}
