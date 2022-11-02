import java.util.Scanner;
public class customerdetails
{
	String name,gender,address;
	short age;
	public void readData()
	{
		Scanner scanner=new Scanner(System.in);
		name=scanner.next();
		gender=scanner.next();
		address=scanner.next();
		age=scanner.nextShort();
	}
public void printData()
	{
		System.out.println("customer_name:"+name);
		System.out.println("gender:"+gender);
		System.out.println("address:"+address);
		System.out.println("age:"+age);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerdetails customer=new customerdetails();
		customer.readData();
		customer.printData();
		
		

	}

}
