package com.rent.car.system.persistence.repository;

import com.rent.car.system.persistence.entity.RentCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RentCarRepository extends JpaRepository<RentCarEntity, Integer> {}
