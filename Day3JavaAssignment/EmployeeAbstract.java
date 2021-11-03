package com.sonata;

abstract class EmployeeAbstract {
	int EmpID;
	String EmpName;
	double BasicPay;
	int AvailableLeaves;
	Address obj;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getBasicPay() {
		return BasicPay;
	}
	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}
	public int getAvailableLeaves() {
		return AvailableLeaves;
	}
	public void setAvailableLeaves(int availableLeaves) {
		AvailableLeaves = availableLeaves;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	public abstract double  CalculateSalary();
	public double  getHR()
	{
		return BasicPay;
	}
	@Override
	public String toString() {
		return "EmployeeAbstract [EmpID=" + EmpID + ", EmpName=" + EmpName + ", BasicPay=" + BasicPay + ", obj=" + obj
				+ "]";
	}
	
}

	


