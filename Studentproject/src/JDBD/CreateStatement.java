package JDBD;
import java.sql.*;
public class CreateStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","useridmysql8");
	   Statement statement=con.createStatement();
	   String sql="select * from student";
	   ResultSet result=statement.executeQuery(sql);
	   while(result.next()) {
		   System.out.println("Sname:"+result.getString("Sname"));
		   System.out.println("Age:"+result.getString("age"));
	   }
   }
   catch(SQLException e) {
	   System.out.println(e);
	   }
   catch(ClassNotFoundException e) {
	   e.printStackTrace();
   }
	}

}
