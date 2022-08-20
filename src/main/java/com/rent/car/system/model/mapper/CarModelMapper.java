package com.rent.car.system.model.mapper;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.entity.CarEntity;

import static java.util.Objects.isNull;

public class CarModelMapper {

    public static CarModel map(CarEntity carEntity) {
        return CarModel.builder()
                .id(carEntity.getId())
                .make(carEntity.getMake())
                .year(carEntity.getYear())
                .model(carEntity.getModel())
                .carType(carEntity.getCarType())
                .color(carEntity.getColor())
                .available(isNull(carEntity.getRentCar())).build();
    }
}
