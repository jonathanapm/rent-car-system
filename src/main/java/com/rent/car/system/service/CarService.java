package com.rent.car.system.service;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.persistence.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void create(CarModel carModel) {

    }

    public void update(CarModel carModel) {

    }

    public void delete(Integer carId) {

    }

    public CarModel findCar(Integer carId) {
        return null;
    }

    public List<CarModel> findAll() {
        return List.of();
    }



}
