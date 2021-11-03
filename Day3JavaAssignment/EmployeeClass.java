package com.sonata;

public class EmployeeClass {
	int empId;
	String empName;
	int empSal;
	
	EmployeeClass(int a,String n,int b)
	{
		this.empId = a;
		this.empName = n;
		this.empSal=b;
	}
	
	 public int SalCal(int HRA,int TA,int DA)
	 {    
		 empSal = empSal+HRA +DA+TA;
		  return empSal;
	 }
	 public void display()
		{
			System.out.println(empId);
			System.out.println(empName);
			System.out.println(empSal);
			
		}
	 public static void main(String args[])
	 {
	 
	 EmployeeClass e1 = new EmployeeClass(369,"dev",2500);
	 e1.display();
	 System.out.println("Salary: "+e1.SalCal(12, 50, 55));

}
}