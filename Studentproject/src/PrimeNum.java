
public class PrimeNum {
	///////Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number
	public static void main(String[] args) {
		//6 6/1 6/2 6/3 6/4 6/6

	    int num = 6;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) //2<3 
	    {
	      // condition for nonprime number
	      if (num % i == 0) {//6%2 ==0
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}
