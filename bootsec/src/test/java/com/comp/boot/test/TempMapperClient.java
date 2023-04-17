package com.comp.boot.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.comp.boot.temp.mapper.TempMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TempMapperClient {

	@Autowired TempMapper tempMapper;
	
	@Test
	public void getDate() {
	String result = tempMapper.getDate();
	System.out.println("출력물 입니다:ㅣ " +result);
	log.debug(result);
	}
}
