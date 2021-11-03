package com.sonata;

public class Triangle extends Shape {
	Triangle (double l,double h,double w )
	{
		super(l,h,w);
	}
	public double CalArea(double a,double b)
	{
		return super.CalArea(a, b)/2;
	}
	public static void main(String args[])
	{
		Triangle t = new Triangle(50,45,75);
		t.display();
		System.out.println("Area of traiangle: "+t.CalArea(50, 75));
	}

}
