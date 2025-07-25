package com.example.demo.factory;

import org.springframework.stereotype.Component;

import com.example.demo.service.EmployeeReportImpl;
import com.example.demo.service.InventoryReportImpl;
import com.example.demo.service.SalesReportImpl;

@Component
public class ReportFactory {
	 
	public static Object getObject(String type) {
		if (type.equals("employee")) {
			Object o = new EmployeeReportImpl();
			return o;
		}

		if (type.equals("inventory")) {
			Object o = new InventoryReportImpl();
			return o;

		}

		if (type.equals("sales")) {
			Object o = new SalesReportImpl();
			return o;

		}

		return null;
	}

}
