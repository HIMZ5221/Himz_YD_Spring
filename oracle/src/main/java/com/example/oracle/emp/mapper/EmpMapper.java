package com.example.oracle.emp.mapper;

import java.util.List;
import java.util.Map;

import com.example.oracle.emp.DeptVO;
import com.example.oracle.emp.EmpVO;


public interface EmpMapper {

	List<DeptVO> getDeptList();
	int deptDelete(DeptVO vo);
	List<EmpVO> getEmpListVO(EmpVO vo);
	List<Map<String, Object>> getEmpList();
	Map<String, Object> getEmp(int value);
	
	}
