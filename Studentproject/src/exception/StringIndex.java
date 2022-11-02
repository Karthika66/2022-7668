package exception;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
    	String s="Full stack java course going ";
    	System.out.println(s.length());
    	char c=s.charAt(0);
    	c=s.charAt(30);
    	System.out.println(c);
    }
    catch(StringIndexOutOfBoundsException e)
    {
    	System.out.println("StringIndexOutOfBoundsException occurs");
    }
    finally
    {
  	  System.out.println("Finally Executed");
    }
	}

}
