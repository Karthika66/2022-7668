import java.util.Scanner;

/// divide three numbers by passing numbers from main method to function

public class DivideNumber {
	public static void divideNumbers(int number1,int number2,int number3)//100 200 //local variables  
	{
		
		System.out.println(number1/number2/number3);//hard coding of values
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3;//local variables 
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number1 and number 2 and number3");
		number1=scanner.nextInt();//100
		number2=scanner.nextInt();//200
		number3=scanner.nextInt();
		//calling function
		divideNumbers(number1,number2,number3);//100,200
		
		System.out.println("enter number1 and number 2 and number3");
		number1=scanner.nextInt();//100
		number2=scanner.nextInt();//200
		number3=scanner.nextInt();
		divideNumbers(number1,number2,number3);
	}

}
