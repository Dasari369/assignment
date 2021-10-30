package com.sonata;

public class Product {
	int proID;
	String proName;
	double proPrice;
	
	Product(){}
	
	Product(int id,String name,int price){
		this.proID = id;
		this.proName=name;
		this.proPrice=price;
		
		}
	 public double totalPrice(double gst)
	 {
		 proPrice=proPrice+gst;
		 return proPrice;
	 }
	
	
	public void display()
	{
		System.out.println(proID);
		System.out.println(proName);
		System.out.println(proPrice);
	}


public static void main(String args[])
{
	Product p1 = new Product();
	p1.proID = 001;
	p1.proName = "Audi car";
	p1.proPrice = 40000;
	p1.display();
	System.out.println(p1.totalPrice(32.40));
	
	Product p2= new Product(002,"Motor Bike",29000);
	p2.display();
	System.out.println(p2.totalPrice(29.005));
	
}
}