import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner=new Scanner(System.in);
				StringTokenizer st = new StringTokenizer("this is a test",",");
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
				}
				
			}


	}

