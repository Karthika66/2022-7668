package JDBD;
import java.sql.*;                                                                                                  
import java.util.Scanner;
 public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    try {
    	System.out.println("Enter user id:");
    	String userid=sc.nextLine();
    	System.out.println("Enter FULL NAME:");
    	String name=sc.nextLine();
    	System.out.println("Enter Date of Brith:");
    	String dob=sc.nextLine();
    	System.out.println("Enter Emailid:");
    	String email=sc.nextLine();
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","Useridmysql8");
    	PreparedStatement pst=connect.prepareStatement("insert into User(USER_ID,FULLNAME,Dateofbrith,EMAIL)values(?,?,?,?)");
    	
    	pst.setString(1, userid);
    	pst.setString(2, name);
    	pst.setString(3, dob);
    	pst.setString(4, email);
    	int i=pst.executeUpdate();
    	if(i!=0) {
    		System.out.println("added");
    	}
    	else {
    		System.out.println("failed");
    	}
    }
    catch(Exception e) {
    	System.out.println(e);
    }
	}
 }
