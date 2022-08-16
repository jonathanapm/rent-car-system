package com.rent.car.system.controller;

import com.rent.car.system.model.RentCarModel;
import com.rent.car.system.persistence.enums.CarType;
import com.rent.car.system.service.RentCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
public class RentCarResource {

    @Autowired
    private RentCarService rentCarService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public void rentCar() {

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity devolutionCar(@PathVariable("id") Integer rentCarId) {
        rentCarService.devolutionCar(rentCarId);
        return ResponseEntity.ok().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RentCarModel>> findAll() {
        return ResponseEntity.ok(rentCarService.findRentCars());
    }

    @GetMapping(value = "/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RentCarModel>> findAll(@PathVariable("type")CarType carType) {
        return ResponseEntity.ok(rentCarService.findRentCars(carType));
    }
}
