package com.sample.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sample.spring.entity.TestEntity;
import com.sample.spring.service.TestService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class TestApi {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/test/create")
	public void createTest() {
		testService.create("hyeji", 10);
	}
	
	@PostMapping("/test/create")
	public void postCreate(
			@RequestBody CreateTestRequest request
			) {
//		Log.info(request.getName());
		System.out.println(request.getName());
		testService.create(request.getName(), request.getAge());
	}
	
	@PutMapping("/test/update")	//update?id=&
	public void putUpdate(
			@RequestParam("id") Long id,
			@RequestBody CreateTestRequest request) {
		testService.update(id, request.getName(), request.getAge());
		
	}
	
//	방법 1 - PathVariable 이용하기
//	@DeleteMapping("/test/{id}/delete")
//	public void deleteTest(
//			@PathVariable("id") Long id
//			) {
//		testService.delete(id);
//	}
	
//	방법 2 - RequestParam 이용하기
	@DeleteMapping("/test/delete")
	public void deleteTest(
			@RequestParam("id") Long id
			) {
		testService.delete(id);
	}
	
//	방법 1 - 전체 data list 단순 예제
//	@GetMapping("/test")
//	public List<TestEntity> jsonData(){
//		return testService.findAll(); //200 ok
//	}
	
//	방법 2 - 전체 data list ResponseEntity 이용 예제
	@GetMapping("/test")
	public ResponseEntity<List<TestEntity>> jsonData(){
		List<TestEntity> data = testService.findAll();
		return ResponseEntity.ok(data); //200 ok
	}
	
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	public static class CreateTestRequest{
		private String name;
		private Integer age;
	}
	
}
