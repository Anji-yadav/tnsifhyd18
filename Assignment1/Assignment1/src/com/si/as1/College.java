package com.si.as1;
//accessing instance and static variables
//Approach1
public class College {
      String name="sri indu";
      static String branch="cse";
      void location()
      {
    	  System.out.println("sheriguda");
      }
      static String affiliation()
      {
    	  return "JNTUH";
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ID=23;
       College c=new College();
 	  System.out.println(ID);
	  System.out.println(c.name);
	  System.out.println(College.branch);
	  c.location();
	  System.out.println(College.affiliation());
	}

}
