package com.company.mvc.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.mvc.emp.DeptVO;
import com.company.mvc.emp.mapper.EmpMapper;

@RestController
public class EmpController {

	
	@Autowired
	EmpMapper mapper;
	
	@GetMapping("/getDept")
//	@ResponseBody 생략가능 왜? 모름 ㅋㅋ
	public List<DeptVO> getDept() {
		return mapper.getDeptList();
	}
	
	@PostMapping("/deptInsert") //Json 형식으로 반드시 작업한다 !
	public DeptVO deptInsert(@RequestBody DeptVO vo)	{
		
		return vo;
	}
}
