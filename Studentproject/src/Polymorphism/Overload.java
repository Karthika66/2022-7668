package Polymorphism;
///Method overloading
public class Overload {
	    public void get(String name,  int id)
	   { 
	System.out.println("Company Name :"+ name);
	  System.out.println("Company Id :"+ id); 
	    } 

	    public void get(int id, String name)
	   { 
	System.out.println("Company Id :"+ id); 
	  System.out.println("Company Name :"+ name);
	    } 
 
	    public static void main (String[] args) { 
	  Overload obj = new Overload();
	  obj.get("Karthi", 1);
	  obj.get(2,"Jhon");
	    } 
	}


