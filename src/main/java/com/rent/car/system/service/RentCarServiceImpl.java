package com.rent.car.system.service;

import com.rent.car.system.controller.exception.CarNotFoundException;
import com.rent.car.system.model.RentCarModel;
import com.rent.car.system.model.mapper.RentCarModelMapper;
import com.rent.car.system.persistence.enums.CarType;
import com.rent.car.system.persistence.repository.RentCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentCarServiceImpl implements RentCarService {

    @Autowired
    private RentCarRepository rentCarRepository;

//    public void rentCar(Integer carId) {
//        rentCarRepository.findByRentCarById(carId)
//                .map(car -> {
//                    if ()
//
//                    throw new CarAlreadyRentedException(car.getCar().getModel(), car.getCar().getCarType());
//                }
//
//    }

    @Override
    public void devolutionCar(Integer rentCarId) {
        rentCarRepository.findById(rentCarId)
                .ifPresentOrElse(rentCarRepository::delete, CarNotFoundException::new);
    }

    @Override
    public List<RentCarModel> findRentCars() {
        return rentCarRepository.findAll().stream()
                .map(RentCarModelMapper::map)
                .toList();
    }

    @Override
    public List<RentCarModel> findRentCars(CarType carType) {
        return rentCarRepository.findAll().stream()
                .filter(item -> carType.equals(item.getCar().getCarType()))
                .map(RentCarModelMapper::map)
                .toList();
    }
}
