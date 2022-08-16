package com.rent.car.system.service;

import com.rent.car.system.model.RentCarModel;
import com.rent.car.system.persistence.enums.CarType;

import java.util.List;

public interface RentCarService {

    void devolutionCar(Integer rentCarId);

    List<RentCarModel> findRentCars();

    List<RentCarModel> findRentCars(CarType carType);
}
