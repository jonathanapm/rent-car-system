package com.rent.car.system.model;

import com.rent.car.system.persistence.enums.CarType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarModel {

    private String color;

    private String year;

    private CarType carType;

    private String make;
}
