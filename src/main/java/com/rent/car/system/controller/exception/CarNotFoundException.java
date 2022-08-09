package com.rent.car.system.controller.exception;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException() {
        super("Veiculo não encontrado");
    }
}
