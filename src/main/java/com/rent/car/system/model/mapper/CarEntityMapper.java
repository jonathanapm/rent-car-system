package com.rent.car.system.model.mapper;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.entity.CarEntity;

import java.time.LocalDateTime;

public class CarEntityMapper {

    public static CarEntity map(CarModel carModel) {
        CarEntity carEntity = new CarEntity();
        carEntity.setColor(carModel.getColor());
        carEntity.setYear(carModel.getYear());
        carEntity.setCarType(carModel.getCarType());
        carEntity.setModel(carModel.getModel());
        carEntity.setRegistrationDate(LocalDateTime.now());
        carEntity.setMake(carModel.getMake());
        return carEntity;
    }
}
