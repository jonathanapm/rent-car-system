package com.rent.car.system.controller;

import com.rent.car.system.model.CarModel;
import com.rent.car.system.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarResource {

    @Autowired
    private CarService carService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> registerCar(@RequestBody CarModel carModel) {
        carService.save(carModel);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("O carro " + carModel.getModel() + " foi registrado com sucesso");
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteCar(@PathVariable("id") Integer id) {
        carService.delete(id);
        return ResponseEntity.ok().body("Carro removido com sucesso");
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarModel> findById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(carService.findCar(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarModel>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }
}
