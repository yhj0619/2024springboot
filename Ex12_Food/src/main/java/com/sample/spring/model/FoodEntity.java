package com.sample.spring.model;

import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="food")
public class FoodEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String address;
	private ZonedDateTime created_at;
	private ZonedDateTime updated_at;
	
	public void changeNameAndAddress(String name, String address) {
		this.name = name;
		this.address = address;
		this.updated_at = ZonedDateTime.now();
	}
}
