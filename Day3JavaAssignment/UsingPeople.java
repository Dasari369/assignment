package com.sonata;

public class UsingPeople {
public static void main (String args[])
{
	Address a1 = new Address();
    a1.setDoorno(1119);
    a1.setStreet("shivalayam street");
    a1.setCity("Eluru");
    a1.setPincode(534004);
    
    Address a2 = new Address();
    a2.setDoorno(100);
    a2.setStreet("Park Street");
    a2.setCity("Bangalore");
    a2.setPincode(53003);
	
	TechnicalEmp t1 = new TechnicalEmp();
	StaffMem s1 = new StaffMem();
	t1.setEmpID(200);
	t1.setEmpName("Devika");
	t1.setBasicPay(15000);
	t1.setAvailableLeaves(4);
	t1.setTechnicalSkill(" C ");
	t1.setObj(a1);
	System.out.println(t1);
	System.out.println("Total Salary: "+t1.CalculateSalary());
	
	
	s1.setEmpID(210);
	s1.setEmpName("Bhargavi");
	s1.setBasicPay(10000);
	s1.setAvailableLeaves(2);
	s1.setTitle("Security");
	s1.setObj(a2);
	System.out.println(s1);
	System.out.println("Total Salary: "+s1.CalculateSalary());
	
	
	
	
}
}
