package JDBD;
import java.sql.*;
public class callableStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/shopping?autoReconnect=true&useSSL=false","root","useridmysql8");
	Statement s=con.createStatement();
	CallableStatement cs
	=con.prepareCall("{call Get_All_order_products()}");
	cs.execute();
	ResultSet result=cs.executeQuery();
	while(result.next()) {
		System.out.println("Product_id: " +result.getString(1)+ "  Product_name: "+result.getString(2)+"\t  Unit_price: "+result.getString(3));
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
