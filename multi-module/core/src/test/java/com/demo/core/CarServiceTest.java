package com.demo.core;

import com.demo.core.id.IdGen;
import com.demo.core.repositories.CarRepository;
import com.demo.models.CarEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;

@ExtendWith(MockitoExtension.class)
class CarServiceTest  {

    @InjectMocks
    private CarService sut;

    @Mock
    private CarRepository repository;

    @Mock
    private IdGen idGen;

    @Test
    public void test_car_create(){
        // Arrange
        Mockito.when(this.repository.save(Mockito.any(CarEntity.class))).thenAnswer(returnsFirstArg());
        Mockito.when(this.idGen.generate()).thenReturn(1L);
        // Act

        CarEntity actual = sut.createCar(new CreateCarInput("Porsche", "911"));

        // Assert

        Assertions.assertEquals("Porsche", actual.getMake());
        Assertions.assertEquals("911", actual.getModel());
        Assertions.assertEquals(1L, actual.getId());
    }

}