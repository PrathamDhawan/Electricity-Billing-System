package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Customer;

@Controller
public class ElectricityBillSystemController {
	
	//Customer customer = new Customer();
	
	@RequestMapping("/getBill")
	@ResponseBody
	public String generateBill(Customer cust) {
		
		return "Your electricity bill due is "+cust.calculateBill();
	} 
}
