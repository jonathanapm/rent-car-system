package com.rent.car.system.controller.advice;

import com.rent.car.system.controller.exception.CarAlreadyRentedException;
import com.rent.car.system.controller.exception.CarNotFoundException;
import com.rent.car.system.controller.exception.RentedCarCantDeleteException;
import com.rent.car.system.controller.response.ErrorMessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceRequest {

    @ExceptionHandler(value = CarAlreadyRentedException.class)
    public ResponseEntity<ErrorMessageResponse> handleCarAlreadyRented(CarAlreadyRentedException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessageResponse.builder().messageResponse(ex.getMessage()).build());
    }

    @ExceptionHandler(value = CarNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleCarNotFoundException(CarNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorMessageResponse.builder().messageResponse(ex.getMessage()).build());
    }

    @ExceptionHandler(value = RentedCarCantDeleteException.class)
    public ResponseEntity<ErrorMessageResponse> handleRentedCarCantDeleteException(RentedCarCantDeleteException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorMessageResponse.builder().messageResponse(ex.getMessage()).build());
    }
}
