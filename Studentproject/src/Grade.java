import java.util.Scanner;


////5.	Write a program in to accept a grade and declare the equivalent description  
public class Grade {
	 public static void main(String args[])
	    {
		 System.out.println("Enter Grade");
		 Scanner scanner=new Scanner(System.in);
		 char grades=scanner.next().charAt(0);
		 switch(grades)
		 {
		 
		 case 'E':
			 System.out.println("Your grade is :Excellent");
			 break;
		 case 'V':
			 System.out.println("Your grade is :Very Good");
			 break;
		 case 'G':
			 System.out.println("Your grade is :Good");
			 break;
		 case 'A':
			 System.out.println("Your grade is :Average");
			 break;
		 case 'F':
			 System.out.println("Your grade is :fail");
			 break;
		default:
			System.out.println("Enter the valid grade");
		 }
	    }
}
