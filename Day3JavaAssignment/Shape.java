package com.sonata;

public class Shape {
double length;
double height ;
double width;
Shape(double l,double h,double w)
{
	this.length=l;
	this.height=h;
	this.width=w;
}

public double CalArea(double a,double b)
{
	return a*b;
}
public void display()
{
	System.out.println(length);
	System.out.println(height);
	System.out.println(width);
	
}
}
