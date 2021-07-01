package com.example.portsadapters;

import com.example.portsadapters.dropoffcar.DropOffCarUseCase;
import com.example.portsadapters.rentcar.RentACarUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RentACarIntegrationTest extends BaseTest {

    @Autowired
    DropOffCarUseCase dropOffCarUseCase;

    @Autowired
    RentACarUseCase rentACarUseCase;


    @Test
    public void rent_a_car()  {
        // Arrange
        dropOffCarUseCase.dropOffCar(new DropOffCarUseCase.DropOffCarInput("mazda", "miata"));
        // Act
        Car actual = rentACarUseCase.rentCar();
        // Assert

        Assertions.assertEquals("mazda", actual.getMake());
        Assertions.assertEquals("miata", actual.getModel());
    }
}
