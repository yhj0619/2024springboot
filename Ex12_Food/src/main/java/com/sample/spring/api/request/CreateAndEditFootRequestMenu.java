package com.sample.spring.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAndEditFootRequestMenu {
	private String name;
	private Integer price;
}
