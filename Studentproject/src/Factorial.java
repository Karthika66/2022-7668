import java.util.Scanner;
public class Factorial {
	
	/////Write a program to find the factorial value of any number entered through the keyboard. 
	//      
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num; 
	        int fact = 1; 
	 
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	 
	        for(int i=num; i>0; i--)
	        {
	            fact *= i;//fact = fact * i// 1 =1*1 =1 = 1*2=2 = 2*3=6 =6*4= 24 *5 =120       
	        }
	 
	        System.out.println("Factorial: "+ fact);
	} 
	   
}
