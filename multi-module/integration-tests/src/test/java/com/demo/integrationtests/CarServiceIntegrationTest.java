package com.demo.integrationtests;

import com.demo.core.CarService;
import com.demo.core.CreateCarInput;
import com.demo.models.CarEntity;
import com.demo.runner.DemoApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class CarServiceIntegrationTest {


    @Autowired
    private CarService sut;


    @Test
    public void test_create_car(){

        CarEntity actual = sut.createCar(new CreateCarInput("Porsche", "911"));
        Assertions.assertEquals("Porsche", actual.getMake());
        Assertions.assertEquals("911", actual.getModel());
        Assertions.assertNotNull(actual.getId());
    }

}
