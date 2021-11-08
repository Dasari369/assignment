package com.sonata;
import java.lang.Comparable;

public class Employee implements Comparable<Employee> {

	int EmpId;
	String EmpName;
	double EmpSal;
	
	Employee(int id,String name,double sal)
	{
		this.EmpId = id;
		this.EmpName = name;
		this.EmpSal = sal;
		
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getEmpSal() {
		return EmpSal;
	}

	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}
	
	@Override
	public String toString() {
		return "EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal ;
	}

	
	
	
	public int compareTo(Employee o) {
	if(EmpId == o.getEmpId())
		try {
		throw new DuplicateEmployeeIDException("Duplicate Employee Id");
		}catch (DuplicateEmployeeIDException e)
	{
			e.printStackTrace();
	}
	
	return 0;
	
	
	
	
	
	
	}	
}

