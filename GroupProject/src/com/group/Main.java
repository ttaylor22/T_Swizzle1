package com.group;

public class Main {
	
	public static void mike() {
		System.out.println("Mike Ramrirez");
	}
	
	public static void heinrich()
	{
		System.out.println("Heinrich Chen");
	}
	
	public static void main(String [] args){

		mike();
		alana();
	}
	
	public static void alana()
	{
		System.out.println("This line is from Alana Icenoad");

		Main m = new Main();
		m.mike();
		heinrich();

	}
}
