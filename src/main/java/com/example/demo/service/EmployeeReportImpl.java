package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeReportImpl implements Report{

	@Override
	public String reportGenerate() {
		// TODO Auto-generated method stub
		return "Employee Report Generated Sucessfully";
	}

}
