package com;

public class Vahicle2 {
	void run () {
		  System.out.println("running mode on");
	  }
	  public class Vehicle1 {
		  void run() {
			  System.out.println("running mode on");
		  }
		  class Bike extends Vehicle2,Vehicle1 {
			  public static void main(String args[]) {
				  Bike d = new Bike ();
				  d.run();
			  }
		  }
}
