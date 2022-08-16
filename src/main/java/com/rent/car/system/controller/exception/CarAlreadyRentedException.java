package com.rent.car.system.controller.exception;

import com.rent.car.system.persistence.enums.CarType;

public class CarAlreadyRentedException extends RuntimeException {

    public CarAlreadyRentedException(String car, CarType carType) {
        super("O carro "+ car+" do tipo "+ carType.name() +" já está alugado");
    }
}
