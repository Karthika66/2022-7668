import java.util.*;
public class SumEvenOdd {
///////////Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner console = new Scanner(System.in);
		 
	        int number;
	        char choice;
	        int even = 0;
	        int odd = 0;
	 
	        do
	        {
	            System.out.print("Enter any number ");
	            number = console.nextInt();//11
	 
	            if( number % 2 == 0)//4%2==0  9%2==0  11%2==0   1
	            {
	                even += number;//0 =0+4=4 4=4+6=10
	            }
	            else
	            {
	                odd += number;//0=0+9=9 9=9+11==20
	            }
	 
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	 
	        }while(choice=='y' || choice == 'Y');
	 
	        System.out.println("Sum of even numbers: " + even);
	        System.out.println("Sum of odd numbers: " + odd);
	    }  
	}