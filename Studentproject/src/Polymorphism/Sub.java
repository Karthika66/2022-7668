package Polymorphism;
///method overloading
public class Sub {
	public int sub(int a,int b) {
		
		return (a-b);
	}
	public int sub(int a, int b,int c)
	{
	
	return (a-b-c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sub s=new Sub();
double result1,result2;
result1=s.sub(10,5);
result2=s.sub(50,10,10);
System.out.println("Sub a b"+result1);
System.out.println("suba b c"+result2);
	}

}
