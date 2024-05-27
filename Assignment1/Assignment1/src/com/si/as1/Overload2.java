package com.si.as1;

public class Overload2 {
	public static int add(int a, int b)
	  {
		  return a+b;
	  }
	  public int add(int a,int b,int c)
	  {
		  return a+b+c;
	  }
	  public static void main(String[] args) {
		Overload2 o=new Overload2();
		System.out.println(Overload2.add(1, 2));
		System.out.println(o.add(1, 2,3));

	}
}
