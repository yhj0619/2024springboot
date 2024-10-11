package com.sample.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.spring.model.FoodEntity;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Long>{
	
}
