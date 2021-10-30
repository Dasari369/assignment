package com.sonata;

public class MyOwnAutoShp {
	
	public static void main(String args[])
	{
		Car c = new Car(400,100000,"White");
		Sedan s = new Sedan(200,40000,"Navy Blue",30);
		Ford f1 = new Ford(150,70000,"Maroon",2015,7);
		Ford f2 = new Ford(300,80000,"Black",2020,3);
		System.out.println("Car");
		c.display();
		System.out.println("Sale Price of Car:"+c.getSalePrice());
		System.out.println("Sedan");
		s.display();
		System.out.println(s.length);
		System.out.println("Sale Price of Sedan:"+s.getSalePrice());
		System.out.println("Ford 1");
		f1.display();
		System.out.println(f1.year);
		System.out.println(f1.manufacturerDiscount);
		System.out.println("Sale Price of ford1:"+f1.getSalePrice());
		System.out.println("Ford 2");
		f2.display();
		System.out.println(f2.year);
		System.out.println(f2.manufacturerDiscount);
		System.out.println("Sale Price of ford2:"+f2.getSalePrice());
	}


}
