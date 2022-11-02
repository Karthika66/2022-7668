import java.util.Scanner;
public class Account {
int totalAmount=50000,balance=0;
   
 public void depositAmount()
 {
	 Scanner scanner=new Scanner(System.in);
	 int depositAmount;
	 depositAmount=scanner.nextInt();
	 System.out.println("Enter the Deposit Amount:"+depositAmount);
	 totalAmount=totalAmount+depositAmount;
 }
 public void withdrawAmount()
 {
	 Scanner scanner=new Scanner(System.in);
	 int withdrawAmount;
	 withdrawAmount=scanner.nextInt();
	 System.out.println("Enter Withdraw Amount:"+withdrawAmount);
	 balance=totalAmount-withdrawAmount;
 }
 public void balanceCheck()
 {
	 Scanner scanner=new Scanner(System.in);
	 long accountNumber=scanner.nextLong();
	 System.out.println("Enter the AccountNumber:"+accountNumber);
	 System.out.println("Your Balance Amount:"+balance);
 }
}
