package com.rent.car.system.model.mapper;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.entity.CarEntity;

import java.time.LocalDateTime;

public class CarEntityMapper {

    public static CarEntity map(CarModel carModel) {
        CarEntity car = new CarEntity();
        car.setColor(carModel.getColor());
        car.setYear(carModel.getYear());
        car.setCarType(carModel.getCarType());
        car.setModel(carModel.getModel());
        car.setRegistrationDate(LocalDateTime.now());
        car.setMake(carModel.getMake());
        car.setId(carModel.getId());
        return car;
    }
}
