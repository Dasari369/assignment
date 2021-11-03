package com.sonata;

public class TechnicalEmp extends EmployeeAbstract{
	String TechnicalSkill ;
	

	public String getTechnicalSkill() {
		return TechnicalSkill;
	}
	public void setTechnicalSkill(String technicalSkill) {
		TechnicalSkill = technicalSkill;
	}
	public double CalculateSalary() {
		double HRA=super.getHR()*0.12;
	    return BasicPay+HRA;
	}
	
	@Override
	public String toString() {
		return "TechnicalEmp [TechnicalSkill=" + TechnicalSkill + ", EmpID=" + EmpID + ", EmpName=" + EmpName
				+ ", BasicPay=" + BasicPay + ", AvailableLeaves=" + AvailableLeaves + ", obj=" + obj + "]";
	}
	


}
