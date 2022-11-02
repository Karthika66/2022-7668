package Keywords;

public class Final {
//Blank final variable
		   final int ROLL_NO;
			 
		   Final(int rnum){
	
		      ROLL_NO=rnum;
		   }
		   void myMethod(){  
		      System.out.println("Roll no is:"+ROLL_NO);
		   }  
		   public static void main(String args[]){  
		     Final obj=new  Final(1066);  
		      obj.myMethod();  
		   }  
	}

