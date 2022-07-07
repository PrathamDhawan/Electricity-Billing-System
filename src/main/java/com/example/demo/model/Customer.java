package com.example.demo.model;

public class Customer {

	final int unitPriceForIndustrial = 12;
	final int unitPriceForRetail = 8;
	final int unitPriceForHomeUsage = 3;
	
	public int getUnitPriceForIndustrial() {
		return unitPriceForIndustrial;
	}
	public int getUnitPriceForRetail() {
		return unitPriceForRetail;
	}
	public int getUnitPriceForHomeUsage() {
		return unitPriceForHomeUsage;
	}
	private int customerType;
	private int units;
	private int days;
	
	public int getCustomerType() {
		return customerType;
	}
	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}
	public int getUnits() {
		return units;
	}
	
	@Override
	public String toString() {
		return "Customer [unitPriceForIndustrial=" + unitPriceForIndustrial + ", unitPriceForRetail="
				+ unitPriceForRetail + ", unitPriceForHomeUsage=" + unitPriceForHomeUsage + ", customerType="
				+ customerType + ", units=" + units + ", days=" + days + "]";
	}
	
	public void setUnits(int units) {
		this.units = units;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	public int calculateBill() {
	
		int totalBill=0;
		
		switch(getCustomerType()) {
		
		case 1 : 
	
			totalBill = (getUnitPriceForIndustrial() * units) * days;
			break;
		
		case 2 : 
		
			totalBill = (getUnitPriceForRetail() * units) * days;
			break;
		
		case 3 : 
			
			if(units < 200)
				totalBill = 0;
			else
				totalBill = (getUnitPriceForHomeUsage() * units) * days;
			break;
		
		default: break;		
		}
		return totalBill;
	}
}
