import java.util.Scanner;
public class Method {
	public static void multipleNumbers()
	{
		int number1,number2;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number1 and number2");
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		System.out.println(number1*number2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleNumbers();
	}

}
