package exception;
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
// A Class that uses above MyException
public class UserDefinedEx  {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("User Defined Exception Example");
        }
        catch (MyException ex) {
            System.out.println("It successfully occurs");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}