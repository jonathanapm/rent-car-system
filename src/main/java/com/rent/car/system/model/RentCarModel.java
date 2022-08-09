package com.rent.car.system.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RentCarModel {

    private Integer cardId;

    private Integer rentCarId;

    private LocalDateTime dateRent;
}
