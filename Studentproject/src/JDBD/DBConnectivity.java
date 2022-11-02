package JDBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class DBConnectivity {
	private static final String CREATE_TABLE="CREATE TABLE User("+"USER_ID int(10) NOT NULL PRIMARY KEY,"+"FULLNAME VARCHAR(20) NOT NULL,"+"Dateofbrith DATE,"+"EMAIL VARCHAR(50))";
	public static void main(String[] args) throws ClassNotFoundException
	{
		String url="jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false";
		String username="root";
		String passwd="useridmysql8";
		Connection connect=null;
		PreparedStatement statement=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try
		{
			connect=DriverManager.getConnection(url,username,passwd);
			statement=connect.prepareStatement(CREATE_TABLE);
			statement.executeUpdate();
			System.out.println("Table Created");
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		
		}
		finally
		{
			try {
				if(statement!=null)
				{
					statement.close();
				}
				if(connect!=null) {
					connect.close();
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

