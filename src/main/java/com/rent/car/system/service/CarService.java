package com.rent.car.system.service;

import com.rent.car.system.controller.exception.CarNotFoundException;
import com.rent.car.system.controller.exception.RentedCarException;
import com.rent.car.system.model.CarModel;
import com.rent.car.system.model.mapper.CarEntityMapper;
import com.rent.car.system.model.mapper.CarModelMapper;
import com.rent.car.system.persistence.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Objects.nonNull;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void save(CarModel carModel) {
        Stream.of(carModel).map(CarEntityMapper::map)
                .findFirst()
                .map(carRepository::save);
    }

    public void delete(Integer carId) {
         carRepository.findById(carId)
                 .ifPresentOrElse(car -> {
                    if (nonNull(car.getRentCar())) {
                        throw new RentedCarException();
                    } else {
                        carRepository.delete(car);
                    }
                }, CarNotFoundException::new);
    }

    public CarModel findCar(Integer carId) {
        return carRepository.findById(carId).map(CarModelMapper::map)
                .orElseThrow(CarNotFoundException::new);
    }

    public List<CarModel> findAll() {
        return carRepository.findAll().stream()
                .map(CarModelMapper::map)
                .toList();
    }



}
