package com.sonata;

public class StaffMem extends EmployeeAbstract {
	String title;
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double CalculateSalary() {
		double HRA=super.getHR()*0.18;
	    return BasicPay+HRA;
	}
	
	@Override
	public String toString() {
		return "StaffMem [title=" + title + ", EmpID=" + EmpID + ", EmpName=" + EmpName + ", BasicPay=" + BasicPay
				+ ", AvailableLeaves=" + AvailableLeaves + ", obj=" + obj + "]";
	}
	
	
	
	
	}
	
	
	

	

