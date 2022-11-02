import java.util.Scanner;///adding three numbers by passing numbers from main method to function
public class adding {

			public static void addNubers(int number1,int number2)//100 200 //local variables  
			{
				
				System.out.println(number1+number2);//hard coding of values
			}
			
			public static void main(String[] args)//JVM will be calling the main method at run time.
			{
				int number1,number2;//local variables 
				Scanner scanner=new Scanner(System.in);
				System.out.println("enter number1 and number 2");
				number1=scanner.nextInt();//100
				number2=scanner.nextInt();//200
				//calling function
				addNubers(number1,number2);//100,200
				
				System.out.println("enter number1 and number 2");
				number1=scanner.nextInt();//100
				number2=scanner.nextInt();//200
				
				addNubers(number1,number2);
				
			}
                              

	}
