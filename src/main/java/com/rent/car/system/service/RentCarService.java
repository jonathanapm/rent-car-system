package com.rent.car.system.service;

import com.rent.car.system.model.RentCarModel;
import com.rent.car.system.persistence.enums.CarType;
import com.rent.car.system.persistence.repository.RentCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class RentCarService {

    @Autowired
    private RentCarRepository rentCarRepository;

    public void rentCar(Integer carId) {

    }

    public void devolutionCar(Integer rentCarId) {

    }

    public List<RentCarModel> findAvailableCars() {
//        return Stream.of(rentCarRepository.findAll()).map()
        return List.of();
    }

    public List<RentCarModel> findAvailableCars(CarType carType) {
        return List.of();
    }
}
