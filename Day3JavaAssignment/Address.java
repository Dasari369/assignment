package com.sonata;

public class Address {
	private int Doorno;
	private String Street;
	private String City;
	private int pincode;
	public int getDoorno() {
		return Doorno;
	}
	public void setDoorno(int doorno) {
		Doorno = doorno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [Doorno=" + Doorno + ", Street=" + Street + ", City=" + City + ", pincode=" + pincode + "]";
	}
	
}