package com.rent.car.system.model.mapper;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.entity.CarEntity;

public class CarModelMapper {

    public static CarModel map(CarEntity carEntity) {
        return CarModel.builder().build();
    }
}
