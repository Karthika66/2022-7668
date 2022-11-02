import java.util.Scanner;///concat names and display full name there
public class Fullname {
public static void fullName(String fname,String lname) {
	System.out.println("fullname"+fname+lname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String fname,lname;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the Fname and Lname");
fname=scanner.nextLine();
lname=scanner.nextLine();
fullName(fname,lname);
	}

}
