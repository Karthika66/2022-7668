package pattern;
import java.util.Scanner;
public class PatternEx1 {
	
		      
		   public static void main(String args[])   
		   {    
		   
		   int i, j, k,row; 
		   for (k=1;k<=9;k++)
		   {
		   Scanner r=new Scanner(System.in);
		   row =r.nextInt();
		  
		   for (i=1;i<=row; i++)   
		   {  
		       
		   for (j=row-i; j>1; j--)   
		   {  
		  
		   System.out.print(" ");   
		   }   
		  
		   for (j=1; j<=i; j++ )   
		   {   
		        
		   System.out.print(i+"  ");   
		   }   
		    
		  System.out.println();   
		   }   
		   }   
		   }
}
