package com.example.dispatcher.rentcar;

import com.example.dispatcher.Car;
import com.example.dispatcher.bus.Handler;
import com.example.dispatcher.common.LoadCarPort;
import com.example.dispatcher.common.SaveCarPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class RentACarHandler implements Handler<RentACarCommand, Car> {

    private final SaveCarPort saveCarPort;
    private final LoadCarPort loadCarPort;


    @Override
    public Car handle(RentACarCommand message) {
        Car rv =  loadCarPort.loadCars().stream().filter(car -> !car.isRented()).findFirst().orElseThrow();
        rv.rent();
        return saveCarPort.save(rv);

    }

    @Override
    public Class<RentACarCommand> link() {
        return RentACarCommand.class;
    }
}
