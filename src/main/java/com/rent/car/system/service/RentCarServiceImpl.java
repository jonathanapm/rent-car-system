package com.rent.car.system.service;

import com.rent.car.system.controller.exception.CarAlreadyRentedException;
import com.rent.car.system.controller.exception.CarNotFoundException;
import com.rent.car.system.model.CarModel;
import com.rent.car.system.model.RentCarModel;
import com.rent.car.system.model.mapper.CarEntityMapper;
import com.rent.car.system.model.mapper.RentCarModelMapper;
import com.rent.car.system.persistence.entity.CarEntity;
import com.rent.car.system.persistence.entity.RentCarEntity;
import com.rent.car.system.persistence.enums.CarType;
import com.rent.car.system.persistence.repository.RentCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class RentCarServiceImpl implements RentCarService {

    @Autowired
    private RentCarRepository rentCarRepository;

    @Autowired
    private CarService carService;

    @Override
    public void rentCar(final Integer carId) {
        final CarModel car = carService.findCar(carId);

        if (!car.getAvailable()) {
            throw new CarAlreadyRentedException(car.getModel(), car.getCarType());
        }

        rentCarRepository.save(mapToSave(CarEntityMapper.map(car)));
    }

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

    private RentCarEntity mapToSave(CarEntity car) {
        RentCarEntity item = new RentCarEntity();
        item.setCar(car);
        item.setDateRent(LocalDateTime.now());
        return item;
    }

}
