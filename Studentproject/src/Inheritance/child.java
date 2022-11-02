package Inheritance;
//Multiple inheritance by using interface
//interface 1 
interface ParentA
{
	public void walk();
}

//interface 2
interface ParentB
{
	public void walk();
	public void run();
}

//multiple inheritance achieved
class child implements ParentA,ParentB
{   
	public void walk()
	{
		System.out.println("ParentA is walking ");
	}
  public void run()
  {
  	System.out.println("ParentB is running ");
  }
  public static void main (String args[])
  {
  	child c = new child();
  	c.walk();
  	c.run();
  }

	}

