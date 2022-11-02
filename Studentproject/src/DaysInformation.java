import java.util.Scanner;
public class DaysInformation {///// print the information about days using switch case


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			System.out.println("enter the Day");
			
			Scanner scanner=new Scanner(System.in);
			
  int Day=scanner.nextInt();
			
			switch(Day) {
			
			case 1: 
				System.out.println("Monday is first day of the week");
				break;
			case 2:		
				System.out.println("Tuesday is second day of the week");
				break;
			case 3:
				System.out.println("Wednesday is third day of the week");
				break;
			case 4:
				System.out.println("Thursday is fourth day of the week");
				break;
			case 5:
				System.out.println("Friday is fiveth day of the week");
				break;
			case 6:
				System.out.println("Saturday is sixth day of the week");
				break;
			case 7:
				System.out.println("Sunday is Holiday");
				break;
			default: System.out.println("enter the valid option ");
}
			System.out.println("enter the Day");
			int Day1=scanner.nextInt();
				switch(Day1) {
				case 1: 
					System.out.println("Monday is first day of the week");
					break;
				case 2:		
					System.out.println("Tuesday is second day of the week");
					break;
				case 3:
					System.out.println("Wednesday is third day of the week");
					break;
				case 4:
					System.out.println("Thursday is fourth day of the week");
					break;
				case 5:
					System.out.println("Friday is fiveth day of the week");
					break;
				case 6:
					System.out.println("Saturday is sixth day of the week");
					break;
				case 7:
					System.out.println("Sunday is Holiday");
					break;
				}
			System.out.println("end of switch");
		}
}