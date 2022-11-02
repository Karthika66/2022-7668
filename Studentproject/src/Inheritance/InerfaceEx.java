package Inheritance;
interface Animal {
	  public void animalSound(); // interface method 
	  public void sleep(); // interface method 
	}

	// Pig "implements" the Animal interface
	class Pig implements Animal
	{
	  public void animalSound() 
	  {
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep()
	  {
	    System.out.println("Zzz");
	  }
	}
	class Cat implements Animal
	{
		public void animalSound()
		{
			System.out.println("THe cat says:Meow meow");
		}
		public void sleep()
		{
			System.out.println("Zzz");
		}
	}
	
public class InerfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig myPig = new Pig();  
	    myPig.animalSound();
	    myPig.sleep();
	    Cat mycat=new Cat();
	    mycat.animalSound();
	    mycat.sleep();
	}

}
