package com.oop.inheritance;

public class HL2 extends HierarchicalInheritance {
    public void C()
    {
    	System.out.println("method C");
    }
    public static void main(String[] args) {
		HL1 h1=new HL1();
		HL2 h2=new HL2();
		h1.A();
		h1.B();
		h2.A();
		//h2.B();
		h2.C();
		
	}
}
