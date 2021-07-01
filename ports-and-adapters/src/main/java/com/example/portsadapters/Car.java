package com.example.portsadapters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Car {
    private String make;
    private String model;
    private CarId id;
    private boolean isRented;


    public void rent(){
        this.isRented = true;
    }

    public void dropoff(){
        this.isRented = false;
    }

    @Data
    @AllArgsConstructor
    @ToString
    public static class CarId {
        private long id;
    }

}
