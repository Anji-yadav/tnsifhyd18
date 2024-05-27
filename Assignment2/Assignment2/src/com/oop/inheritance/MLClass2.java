package com.oop.inheritance;

public class MLClass2 extends MLClass1{
     public void C()
     {
    	 System.out.println("method C from child class 2");
     }
     public static void main(String[] args) {
		MLClass1 m1= new MLClass1();
		m1.A();
		m1.B();
		//m1.C();
		MLClass2 m2= new MLClass2();
		m2.A();
		m2.B();
		m2.C();
		}
}
