package com.rent.car.system.controller.exception;

public class RentedCarException extends RuntimeException {

    public RentedCarException() {
        super("Carro não pode ser exluído por estar alugado");
    }

    public RentedCarException(String message) {
        super(message);
    }
}
