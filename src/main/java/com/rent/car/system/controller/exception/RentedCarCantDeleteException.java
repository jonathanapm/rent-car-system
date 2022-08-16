package com.rent.car.system.controller.exception;

public class RentedCarCantDeleteException extends RuntimeException {

    public RentedCarCantDeleteException() {
        super("Carro não pode ser exluído por estar alugado");
    }

    public RentedCarCantDeleteException(String message) {
        super(message);
    }
}
