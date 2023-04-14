package com.example.oracle.emp;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
    
	public String employeeId;   
	public String firstName;
	public String lastName;
	public String email;
	public String phoneNumber;
	public Date hireDate; 
	public String jobId;
	public String salary;
	public String commissionPct;
	public String managerId;
	public String departmentId; 
	

}

