package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SalesReportImpl implements Report {

	@Override
	public String reportGenerate() {
		// TODO Auto-generated method stub
		return "Sales Report Generated " ;
	}

}
