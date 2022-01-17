package com.demo.repositories;

import com.demo.models.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CarJpaRepository extends JpaRepository<CarEntity, Integer> {
}
