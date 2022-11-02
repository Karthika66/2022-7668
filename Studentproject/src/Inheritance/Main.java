package Inheritance;
class Father {
	  String familyName;
	  String houseaddress;
	  Father() {
	    familyName = "Gupta";
	    houseaddress = "Delhi";
	  }
	}
	class Son extends Father {
	  Son() {
	    System.out.println("I am the Son");
	    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
	  }
	}
	class Daughter extends Father {
	  Daughter() {
	    System.out.println("I am the Daughter");
	    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
	  }
	}
	class Mother extends Son
	{
		Mother()
		{
			System.out.println("I am the Mother");
		    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
		  }
	}
	

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Son s = new Son();
			    Daughter d = new Daughter();
			    Mother m=new Mother();
			  }
	}

