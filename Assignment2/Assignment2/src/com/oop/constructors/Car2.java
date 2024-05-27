package com.oop.constructors;
//parameterised constructor
public class Car2 {
	   private String doors;
	   private String engine;
	   private String driver;
	   private int speed;
	   public Car2(String doors,String engine,String driver,int speed)
	   {
		   this.doors=doors;
		   this.engine=engine;
		   this.driver=driver;
		   this.speed=speed;
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

