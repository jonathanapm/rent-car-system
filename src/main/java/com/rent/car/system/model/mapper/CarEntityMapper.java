package com.rent.car.system.model.mapper;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.entity.CarEntity;

import java.time.LocalDateTime;

public class CarEntityMapper {

    public static CarEntity map(CarModel carModel) {
        return CarEntity.builder()
                .color(carModel.getColor())
                .year(carModel.getYear())
                .carType(carModel.getCarType())
                .model(carModel.getModel())
                .registrationDate(LocalDateTime.now())
                .make(carModel.getMake()).build();
    }
}
