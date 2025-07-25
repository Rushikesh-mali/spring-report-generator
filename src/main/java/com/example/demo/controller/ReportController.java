package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.service.EmployeeServiceImpl;
//import com.example.demo.service.InventoryReportImpl;
import com.example.demo.service.Report;
//import com.example.demo.service.SalesReportImpl;


@RestController
public class ReportController {

	@Autowired
	ApplicationContext applicationContext;

	Report r ;
	
	@GetMapping("reports/{type}")
	String showReport(@PathVariable String type) {
		
		if (type.equals("employee")) {
		    r = (Report) applicationContext.getBean("employeeReportImpl");
		}
			
		
		
		if (type.equals("inventory")) {
			r = (Report) applicationContext.getBean("inventoryReportImpl");
			
			
		}
		
		if (type.equals("sales")) {
			r= (Report) applicationContext.getBean("salesReportImpl");
		}

		return r.reportGenerate();
	}
}
