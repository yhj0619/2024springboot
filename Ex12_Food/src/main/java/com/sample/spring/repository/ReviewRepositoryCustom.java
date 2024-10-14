package com.sample.spring.repository;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Repository;

import com.sample.spring.model.ReviewEntity;

@Repository
public interface ReviewRepositoryCustom {
	Slice<ReviewEntity> findSliceByFoodId(Long foodId, Pageable page);
}
