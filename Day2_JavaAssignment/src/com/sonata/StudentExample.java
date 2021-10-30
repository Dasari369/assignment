package com.sonata;

public class StudentExample {
	    int stuId;
		String stuName;
		String stuClass;
		
		StudentExample(){}
		StudentExample(int a,String n,String c)
		{
			this.stuId=a;
			this.stuName=n;
			this.stuClass=c;
		}
		
	 public void display()
		{
			System.out.println(stuId);
			System.out.println(stuName);
			System.out.println(stuClass);
			
		}

	public static void main(String args[])
	{
		StudentExample s1 = new StudentExample();
		s1.stuId = 123;
		s1.stuName="Devika";
		s1.stuClass="Eighth class";
		s1.display();
	 StudentExample s2 = new StudentExample(369,"Bhargavi","ninth class");
	  s2.display();
	}

}
