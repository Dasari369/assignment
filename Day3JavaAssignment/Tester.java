package com.sonata;

public class Tester extends EmployeeClass {
	Tester(int a, String n, int b) {
		super(a, n, b);
		// TODO Auto-generated constructor stub
	}

	public int SalCal(int HRA,int TA,int DA) {
		
		super.SalCal(HRA,TA,DA);
		return empSal;
	}
	public static void main (String args[])
	{
		
	   Tester t1 = new Tester(369,"vyshnavi",6000);
		t1.display();
		System.out.println("Salary of tester: "+t1.SalCal(50,50,50));

	}

}
