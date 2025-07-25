package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryReportImpl implements Report {

	@Override
	public String reportGenerate() {
		// TODO Auto-generated method stub
		return "Inventory report Generated";
	}

}
