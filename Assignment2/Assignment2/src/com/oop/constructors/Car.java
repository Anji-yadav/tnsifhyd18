package com.oop.constructors;
//DFEAULT CONSTRUCTOR
public class Car {
   private String doors;
   private String engine;
   private String driver;
   private int speed;
   public Car()
   {
	   doors="open";
	   engine="on";
	   driver="seated";
	   speed=10;
   }
   public String run()
   {
	   if(doors.equals("open")&&engine.equals("on")&&driver.equals("seated")&&speed>0)
	   {
		   return "car is running";
	   }
	   else
	   {
		   return "car is not running";
	   }
   }
}
