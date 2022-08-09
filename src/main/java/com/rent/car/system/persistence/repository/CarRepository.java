package com.rent.car.system.persistence.repository;

import com.rent.car.system.persistence.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Long, CarEntity> {
}
