package Abstraction;
///Abstraction
import java.util.Scanner;
  abstract class MyTest {
	int n;
abstract public void calculation(int a,int b);
}
class Addition extends MyTest
{
	public void calculation(int a,int b)
	{
		n=a+b;
		System.out.println("Addition of a and b "+n);
}
}
class Subtraction extends MyTest
{
	public void calculation(int a,int b)
	{
		n=a-b;
		System.out.println("Subtraction of a and b "+n);
	}
}
class Multiplication extends MyTest
{
	public void calculation(int a,int b)
	{
		n=a*b;
		System.out.println("Multiplication of a and b "+n);
	}
}
class Abstraction
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b");
		a=s.nextInt();
		b=s.nextInt();
		MyTest a1=new Addition();
		MyTest s1=new Subtraction();
		MyTest m=new Multiplication();
a1.calculation(a, b);
s1.calculation(a, b);
m.calculation(a, b);
}
}

