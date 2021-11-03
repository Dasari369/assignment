package com.sonata.Exception;


public class EmpSalException {
	EmpSalException(int id,String n,double esal)
	{
		this.empid=id;
		this.empname=n;
		this.esal=esal;
	}
	int empid;
	String empname;
	double esal;
	
	public double AnnualSal()
	{
		return esal*12;
	}
	
	public static void main(String args[]) throws MyCustomException{
		double yearlysal;
		EmpSalException e1 = new EmpSalException(2100,"Bhargavi",30000);
		yearlysal = e1.AnnualSal();
		if(yearlysal<100000)
		throw new MyCustomException("Yearly salary is less than 100000");
		else
			System.out.println(yearlysal+" is greater than 100000");
			
		
	}

}