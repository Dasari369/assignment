package com.sonata;

public class Square extends Shape {
	Square (double l,double h,double w )
	{
		super(l,h,w);
	}
	public double CalArea(double a,double b)
	{
		return super.CalArea(a, b);
	}
	public static void main(String args[])
	{
		Square s = new Square(100,200,300);
		s.display();
		System.out.println("Area of Square: "+s.CalArea(100,300));
	}

}
