package com.example.dispatcher.dropoffcar;

import com.example.dispatcher.Car;
import com.example.dispatcher.bus.Handler;
import com.example.dispatcher.common.IdGenerator;
import com.example.dispatcher.common.SaveCarPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class DropOffCarHandler implements Handler<DropOffCarCommand, Car> {

    private final SaveCarPort saveCarPort;
    private final IdGenerator idGen;


    @Override
    public Car handle(DropOffCarCommand message) {
        Car car = new Car();
        car.dropoff();
        car.setMake(message.getMake());
        car.setModel(message.getModel());
        car.setId(new Car.CarId(idGen.generate()));
        return saveCarPort.save(car);

    }

    @Override
    public Class<DropOffCarCommand> link() {
        return DropOffCarCommand.class;
    }
}
