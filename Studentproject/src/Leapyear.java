import java.util.Scanner;/////1.	Write program to find whether a given year is a leap year or not.
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter any year:");
		        int year = s.nextInt();
		        boolean flag = false;
		        if(year % 400 == 0)
		        {
		            flag = true;
		        }
		        else if (year % 100 == 0)
		        {
		            flag = false;
		        }
		        else if(year % 4 == 0)
		        {
		            flag = true;
		        }
		        else
		        {
		            flag = false;
		        }
		        if(flag)
		        {
		            System.out.println("Year "+year+" is a Leap Year");
		        }
		        else
		        {
		            System.out.println("Year "+year+" is not a Leap Year");
		        }
		    }
	}

