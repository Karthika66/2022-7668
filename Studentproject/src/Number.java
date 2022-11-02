import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char fname= ' ';
		char mname= ' ';
		char lname=' ';
		
		System.out.println("Enter the firstname,middlename and lastname initials "); 
		
		Scanner scanner=new Scanner(System.in);
		
		fname=scanner.next().charAt(0);//25
		mname=scanner.next().charAt(0);
		lname=scanner.next().charAt(0);
		
		System.out.println("fname mname lastname initials arefname "+fname+ " " +mname+ " " +lname);
	}

}
