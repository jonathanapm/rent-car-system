package com.rent.car.system.service;

import com.rent.car.system.model.CarModel;

import java.util.List;

public interface CarService {

    void save(CarModel carModel);

    void delete(Integer carId);

    CarModel findCar(Integer carId);

    List<CarModel> findAll();
}
