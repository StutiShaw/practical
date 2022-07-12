package com;
public class Car1 {  
	void run() {
		System.out.println("The car name is BMW");
	}
}
	class Suzuki extends Car1 { 
		void run() {  
		System.out.println("The car name is Scorpio");	
		}
	public static void main(String args[])  {
		Suzuki obj = new Suzuki();   
		obj.run();  
	}
	
	}