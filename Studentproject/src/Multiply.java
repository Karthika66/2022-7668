import java.util.Scanner;////Multiply three numbers by passing numbers from main method to function

public class Multiply {
	public static void multiplyNumbers(int number1,int number2,int number3)//100 200 //local variables  
	{
		int result=number1*number2*number3;
		System.out.println("The Mulitply of three numbersis:"+result);//hard coding of values
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int number3=scan.nextInt();
		//calling function
		System.out.println("enter  the three numbers"+number1+""+number2+""+number3);
		
		multiplyNumbers(number1,number2,number3);
		
	}

}
