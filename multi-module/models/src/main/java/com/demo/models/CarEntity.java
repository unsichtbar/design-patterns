package com.demo.models;

import javax.persistence.*;

@Entity
@Table
public class CarEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String make;

    @Column
    private String model;

    public CarEntity(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public CarEntity(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
