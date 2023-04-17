package com.company.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.persistence.TempMapper;

@Service
public class TempServiceImpl implements TempService{

	@Autowired
	private TempMapper mapper;
	
	@Override
	public String getDate() {
		System.out.println("service 까지는 온다리~~~");
		String result = mapper.getDate();
		System.out.println(result);
		return result;
	}

	
	
	
}
