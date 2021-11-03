package com.sonata;

public class Developer extends EmployeeClass {
	Developer(int a, String n, int b) {
		super(a, n, b);
		// TODO Auto-generated constructor stub
	}

	public int SalCal(int HRA,int TA,int DA) {
		
			super.SalCal(HRA,TA,DA);
			return empSal;
	}
			public static void main (String args[])
			{
				
			   Developer d1 = new Developer(369,"vyshnavi",6000);
				d1.display();
				System.out.println("Salary of developer: "+d1.SalCal(10,20,30));

			}
		
	}


