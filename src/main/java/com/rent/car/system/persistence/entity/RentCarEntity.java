package com.rent.car.system.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "rent_car")
public class RentCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentCarId;

    @OneToOne
    @JoinColumn(name = "car_id")
    private CarEntity carId;

    @Column(name = "date_rent", nullable = false)
    private LocalDateTime dateRent;
}
