package com.oop.inheritance;

public class child extends Hy1 {
	void D()
	   {
		   System.out.println("method D");
	   }
	public static void main(String[] args) {
		child c= new child();
		
		c.A();
		c.B();
		//c.C();
		c.D();
		
	}
}
