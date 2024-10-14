package com.sample.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sample.spring.model.QReviewEntity;
import com.sample.spring.model.ReviewEntity;

@Repository
public class ReviewRepositoryImpl implements ReviewRepositoryCustom{

	@Autowired
	private JPAQueryFactory queryFactory;
	
	@Override
	public Slice<ReviewEntity> findSliceByFoodId(Long foodId, Pageable page) {
		// TODO Auto-generated method stub
		List<ReviewEntity> reviews = queryFactory.select(QReviewEntity.reviewEntity)
				.from(QReviewEntity.reviewEntity)
				.where(QReviewEntity.reviewEntity.foodId.eq(foodId))
				.offset((long)page.getPageNumber() * page.getPageSize()) //0page * 10pagesize = 0임/ offset은 이후임!
				.limit(page.getPageSize() + 1) //pagesize 크기를 지정
				.fetch();
		return new SliceImpl<>(
				reviews.stream().limit(page.getPageSize()).toList(),
				page,
				reviews.size() > page.getPageSize() //next page가 있으면 true
				);
	}

}
