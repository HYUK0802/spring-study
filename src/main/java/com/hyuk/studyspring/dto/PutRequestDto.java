package com.hyuk.studyspring.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PutRequestDto {

    private String name;
    private int age;

    private List<CarDto> carList;

    public String getName() {
        return name;
    }

    public PutRequestDto setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PutRequestDto setAge(int age) {
        this.age = age;
        return this;
    }

    public List<CarDto> getCarList() {
        return carList;
    }

    public PutRequestDto setCarList(List<CarDto> carList) {
        this.carList = carList;
        return this;
    }

    @Override
    public String toString() {
        return "PutRequestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
