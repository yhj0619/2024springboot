package com.sample.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name="test")
public class TestEntity {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	
	public TestEntity(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public void changeNameAndAge(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
