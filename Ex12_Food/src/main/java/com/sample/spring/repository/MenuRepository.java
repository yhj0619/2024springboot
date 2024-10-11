package com.sample.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.spring.model.MenuEntity;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long>{

	List<MenuEntity> findAllByFoodId(Long foodId);

}
