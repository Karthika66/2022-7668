package exception;

public class nullEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
	String str="0";
	System.out.println(str.length());
    }
    catch(NullPointerException e)
    {
    	System.out.println("null pointer exception occurs");
    }
    finally
    {
  	  System.out.println("Finally Executed");
    }
	}

}
