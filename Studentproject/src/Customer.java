import java.util.Scanner;
public class Customer 
			{
			//properties 
			//data type variablename;
			//Member variables or instance variable
			String name,address,mobileno;
			short age;
			public void readData()//verb+noun
			{
				Scanner scanner=new Scanner(System.in);
				name=scanner.next();
				address=scanner.next();
				mobileno=scanner.next();
				age=scanner.nextShort();
			}
			public void printData()
			{
				System.out.println("name  --->"+name);
				System.out.println("address  --->"+address);
				System.out.println("mobile_no  --->"+mobileno);
				System.out.println("age  --->"+age);
			}
public static void main(String[] args)
{
	customerdetails customer=new customerdetails();
	customer.readData();
	customer.printData();
}
	}


