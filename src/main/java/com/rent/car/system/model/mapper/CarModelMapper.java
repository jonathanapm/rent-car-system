package com.rent.car.system.model.mapper;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.entity.CarEntity;

import static java.util.Objects.isNull;

public class CarModelMapper {

    public static CarModel map(CarEntity car) {
        return CarModel.builder()
                .id(car.getId())
                .make(car.getMake())
                .year(car.getYear())
                .model(car.getModel())
                .carType(car.getCarType())
                .color(car.getColor())
                .available(isNull(car.getRentCar())).build();
    }
}
