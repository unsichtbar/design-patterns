package com.example.portsadapters.dropoffcar;

import com.example.portsadapters.Car;
import com.example.portsadapters.common.IdGenerator;
import com.example.portsadapters.common.SaveCarPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class DropOffCarService implements DropOffCarUseCase {

    private final SaveCarPort saveCarPort;
    private final IdGenerator idGen;


    @Override
    public Car dropOffCar(DropOffCarInput message) {
        Car car = new Car();
        car.dropoff();
        car.setMake(message.getMake());
        car.setModel(message.getModel());
        car.setId(new Car.CarId(idGen.generate()));
        return saveCarPort.save(car);

    }
}
