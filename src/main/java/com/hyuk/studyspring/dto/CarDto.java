package com.hyuk.studyspring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDto {

    private String name;

    @JsonProperty("car_number")
    private String carNumber;

    public String getName() {
        return name;
    }

    public CarDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public CarDto setCarNumber(String carNumber) {
        this.carNumber = carNumber;
        return this;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "name='" + name + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
