package com.si.as1;
//overloading instance methods
public class Overload1 {
  public int add(int a, int b)
  {
	  return a+b;
  }
  public int add(int a,int b,int c)
  {
	  return a+b+c;
  }
  public static void main(String[] args) {
	Overload1 o=new Overload1();
	System.out.println(o.add(1, 2));
	System.out.println(o.add(1, 2,3));

}
}
