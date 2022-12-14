package com.rent.car.system.persistence.entity;

import com.rent.car.system.persistence.enums.CarType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "Car")
@NoArgsConstructor
@Table(name = "tb_car")
public class CarEntity {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String year;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_type", nullable = false)
    private CarType carType;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "car")
    private RentCarEntity rentCar;
}
