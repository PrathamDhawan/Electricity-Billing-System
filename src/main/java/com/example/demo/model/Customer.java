package com.example.demo.model;

public class Customer {

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
	public void setUnits(int units) {
		this.units = units;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Customer [customerType=" + customerType + ", units=" + units + ", days=" + days + "]";
	}
}
