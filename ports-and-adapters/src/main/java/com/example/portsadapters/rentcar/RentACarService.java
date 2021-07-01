package com.example.portsadapters.rentcar;

import com.example.portsadapters.Car;
import com.example.portsadapters.common.LoadCarPort;
import com.example.portsadapters.common.SaveCarPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class RentACarService implements RentACarUseCase {

    private final SaveCarPort saveCarPort;
    private final LoadCarPort loadCarPort;


    @Override
    public Car rentCar() {
        Car rv =  loadCarPort.loadCars().stream().filter(car -> !car.isRented()).findFirst().orElseThrow();
        rv.rent();
        return saveCarPort.save(rv);

    }

}
