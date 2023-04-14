package com.example.oracle.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.oracle.emp.mapper.EmpMapper;



@Controller
public class EmpController {

	@Autowired
	EmpMapper mapper;
	
	@GetMapping("/empList")
	public String empList(Model model) {
		List<Map<String, Object>> list = mapper.getEmpList();
		System.out.println(list);
		model.addAttribute("empList", mapper.getEmpListVO(null));
		return "empList";
	}
}
