package com.sonata;

public class Rectangle extends Shape {
	Rectangle(double l,double h,double w)
	{
		super(l,h,w);
	}
	public double CalArea(double l,double w)
	{
		return super.CalArea(l, w);
	}
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(150,250,450);
		r.display();
		System.out.println("Area of Rectangle: "+r.CalArea(150, 450));
	}
}
