package com.demo.core;

public class CreateCarInput {
    private String make;
    private String model;

    public CreateCarInput(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
