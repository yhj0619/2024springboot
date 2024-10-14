package com.sample.spring.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="tb1_todo")
public class TodoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tno;
	private String title;
	private String writer;
	private boolean complete;
	private LocalDate dueDate;
	public void setTno(Long tno) {
		this.tno = tno;
	}
	public void changeTitle(String title) {
		this.title = title;
	}
	public void changeWriter(String writer) {
		this.writer = writer;
	}
	public void changeComplete(boolean complete) {
		this.complete = complete;
	}
	public void changeDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
