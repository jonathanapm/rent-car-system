package com.rent.car.system.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_rent_car")
public class RentCarEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentCarId;

    @OneToOne(mappedBy = "rentCar")
    private CarEntity car;

    @Column(name = "date_rent", nullable = false)
    private LocalDateTime dateRent;
}
