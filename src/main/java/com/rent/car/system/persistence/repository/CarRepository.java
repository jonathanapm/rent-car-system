package com.rent.car.system.persistence.repository;

import com.rent.car.system.persistence.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Integer> {
}
