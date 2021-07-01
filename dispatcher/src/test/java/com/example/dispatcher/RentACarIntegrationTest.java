package com.example.dispatcher;

import com.example.dispatcher.bus.Dispatcher;
import com.example.dispatcher.dropoffcar.DropOffCarCommand;
import com.example.dispatcher.rentcar.RentACarCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutionException;

public class RentACarIntegrationTest extends BaseTest {

    @Autowired
    Dispatcher dispatcher;


    @Test
    public void rent_a_car() throws ExecutionException, InterruptedException {
        // Arrange
        RentACarCommand message = new RentACarCommand();
        Assertions.assertDoesNotThrow(() -> dispatcher.dispatch(new DropOffCarCommand("mazda", "miata")).get());
        // Act
        Car actual = dispatcher.dispatch(message).get();
        // Assert

        Assertions.assertEquals("mazda", actual.getMake());
        Assertions.assertEquals("miata", actual.getModel());
    }
}
