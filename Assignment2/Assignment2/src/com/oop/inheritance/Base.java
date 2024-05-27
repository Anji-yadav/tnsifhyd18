package com.oop.inheritance;

public class Base extends SingleInheritance{
  public void lion()
  {
	  System.out.println("lion roars");
  }
  public static void main(String[] args) {
	Base b= new Base();
	b.cat();
	b.dog();
	b.lion();
}
}
