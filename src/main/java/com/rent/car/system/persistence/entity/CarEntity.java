package com.rent.car.system.persistence.entity;

import com.rent.car.system.persistence.enums.CarType;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class CarEntity {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String year;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @Column(name = "car_type", nullable = false)
    private CarType carType;
}
