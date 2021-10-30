package com.sonata;

public class Tshirt {
	String color;
	String material;
	String design;
	Tshirt(String color,String material,String design)
	{
		this.color=color;
		this.material=material;
		this.design = design;
	
	}

	public String Size(String size)
	{
		return size;
	}
	public void display()
	{
		System.out.println("T-shirt color: "+color);
		System.out.println("T-shirt material: "+material);
		System.out.println("T-shirt design: "+design);
	}

	
	public static void main(String args[])
	{
		Tshirt t1 = new Tshirt("Pink","Cotton","Printed Pattern");
		t1.display();
		System.out.println("Available Sizes :"+t1.Size("small")+" "+ t1.Size("Large")+" "+t1.Size("Xtra-Large"));
		Tshirt t2 = new Tshirt("Grey","Linen","Abstarct");
		t2.display();
		System.out.println("Available Sizes :"+t2.Size("small")+" "+ t2.Size("Large")+" "+t2.Size("Xtra-Large"));
		Tshirt t3 = new Tshirt("Blue","Polyster","Hearts");
		t3.display();
		System.out.println("Available Sizes :"+t3.Size("small")+" "+ t3.Size("Large")+" "+t3.Size("Xtra-Large"));
    
		
		
	}
}
