package com.sonata;

import java.util.LinkedList;
import java.util.List;

public class Employeeimpl implements Employeeint {
	
	List<Employee> emplist = new LinkedList<>();

	public void addEmployee(Employee e) {
		emplist.add(e);
		
		}

	public void deleteEmployee(Employee e) {
		
		emplist.remove(e);
		for(Employee emp: emplist)
		{
			System.out.println(emp);
		}
		
	}

	public double yearSalary(Employee e1) {
		double yearsal = 0;
		for(Employee e:emplist)
		{
			yearsal = e.getEmpSal()*12;
			System.out.println(e+"  "+"Annual Sal "+yearsal);
			if(e.getEmpSal()<10000)
			{
				double IncSal = 0;
				IncSal = e.getEmpSal()+5000;
				System.out.println("Increased Salary for Employee "+e.getEmpName()+" "+e.getEmpSal()+" "+"Increased salary "+IncSal);
			}
			
		}
	          return yearsal;
	}

	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		return e1.getEmpSal();
	}
	 
	
}

