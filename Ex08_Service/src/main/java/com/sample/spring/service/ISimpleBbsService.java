package com.sample.spring.service;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sample.spring.dto.SimpleBbsDto;


public interface ISimpleBbsService {
	public List<SimpleBbsDto> list();	
	public Integer count();
	public SimpleBbsDto view(String id);
	public int write(String writer, String title, String content);
	public int delete(@Param("_id") String id); //delete?id=1
}
