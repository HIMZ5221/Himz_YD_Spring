package com.company.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.company.app.persistence.TempMapper;
import com.company.app.persistence.UserMapper;

import lombok.extern.log4j.Log4j;

@WebAppConfiguration // 컨트롤 테스트용.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/config/*-context.xml" })
@Log4j
public class TempMapperClient {

	@Autowired
	private TempMapper tempMapper;
	@Autowired
	private UserMapper userMapper;
	
	public void getDate() {
		System.out.println("출력중출력중출력중출력중출력중출력중");
		String result = tempMapper.getDate();
		log.info(result);
		System.out.println(result);
	}
	
	@Test
	public void getUser() {
		
	}
	
}
