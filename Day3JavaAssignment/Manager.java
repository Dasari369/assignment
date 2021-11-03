package com.sonata;

public class Manager extends EmployeeClass{
	Manager(int a, String n, int b) {
		super(a, n, b);
		// TODO Auto-generated constructor stub
	}

	public int totalSal(int HRA,int TA,int DA)
	{
		super.SalCal(HRA,TA,DA);
		  return empSal;
	}
	public static void main (String args[])
	{
		
	    
	    Manager m1 = new Manager(369,"Monika",6000);
		m1.display();
		System.out.println("Salary of manager "+m1.SalCal(20,20,50));

	}
}
