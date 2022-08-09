package com.rent.car.system.model.mapper;

import com.rent.car.system.model.RentCarModel;
import com.rent.car.system.persistence.entity.RentCarEntity;

public class RentCarModelMapper {
    public static RentCarModel map(RentCarEntity mapped) {
        return RentCarModel.builder()
                .cardId(mapped.getCar().getId())
                .rentCarId(mapped.getRentCarId())
                .dateRent(mapped.getDateRent()).build();
    }
}
