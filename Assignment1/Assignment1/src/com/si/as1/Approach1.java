package com.si.as1;
//accessing instance and static variables through approach1
public class Approach1 {
	int x=10;
	static String name="anji";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double y= 10.5;
     System.out.println(y);
     Approach1 a1=new Approach1();
     System.out.println(a1.x);
     System.out.println(Approach1.name);
	}

}
