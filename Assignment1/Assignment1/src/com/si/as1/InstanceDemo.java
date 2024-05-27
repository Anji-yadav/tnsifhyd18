package com.si.as1;
//Instance methods can access static and instance variables
//static methods can only access static variables
public class InstanceDemo {
    int a=10;
    static int b=20;
    int c=30;
    static void hello()
    {
     // System.out.println("instance variable="+a); 
    	//Error
      //System.out.println("instance variable="+c);
    	//Error
      System.out.println("Static variable="+b);
    }
	void hi()
	{
		System.out.println("instance variable="+a); 
		System.out.println("instance variable="+c);
	    System.out.println("Static variable="+b);
	}
	public static void main(String [] args) {
		InstanceDemo i=new InstanceDemo();
		System.out.println("a="+i.a);
		System.out.println("b="+InstanceDemo.b);
		System.out.println("c="+i.c);
		InstanceDemo.hello();
		i.hi();		
		
     } 
	}
