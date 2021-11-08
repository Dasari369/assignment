package com.sonata;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class UserEmployee {
	public static void main(String args[])
	{
		Employee e1 = new Employee(123,"klaus",50000);
		Employee e2 = new Employee(211,"rebekah",20000);
		Employee e3 = new Employee(312,"stefen",11000);
		Employee e4 = new Employee(199,"damon",5000);
		Employee e5 = new Employee(456,"elena",40000);
		Employee e6 = new Employee(209,"hope",2000);
	//adding employees by calling addEmployee method
	   Employeeimpl emplist = new Employeeimpl();
	   emplist.addEmployee(e1);
	   emplist.addEmployee(e2);
	   emplist.addEmployee(e3);
	   emplist.addEmployee(e4);
	   emplist.addEmployee(e5);
	   emplist.addEmployee(e6);
	   //calling method yearsalary to calculate and display yearlysal for employees
	   emplist.yearSalary(e1);
	   
	   System.out.println("After deleting Employee");
	   //deleting employee 6
	   emplist.deleteEmployee(e6);
 }

	
   
	}


