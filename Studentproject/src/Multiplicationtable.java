import java.util.Scanner;
public class Multiplicationtable {
	/////Write a program that prompts the user to input a positive integer. It should then print t                  he multiplication table of that number. 

	   public static void main(String[] args)

	{
	   int j,n,count=10;

	   System.out.print("Input the number(Table to be calculated): ");
	
	   System.out.print("Input number of terms : ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();

	   System.out.println ("\n");
	   for(j=0;j<=count;j++)
	  
	     System.out.println(n+" X "+j+" = " +n*j);
	
	}
}


;