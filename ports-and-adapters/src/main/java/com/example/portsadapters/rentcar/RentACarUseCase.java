package com.example.portsadapters.rentcar;

import com.example.portsadapters.Car;
import com.example.portsadapters.annotations.InputPort;

@InputPort
public interface RentACarUseCase {

    Car rentCar();
}
