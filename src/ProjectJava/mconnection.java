package ProjectJava;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class mconnection
{

	static Connection c;
	public static Connection connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajay","root","1234");
			System.out.println("Connected");
			
		}
		catch(ClassNotFoundException cs)
		{
			cs.printStackTrace();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		
		return c;
	}
		
		public static void main(String[] args)
		{
			connect();
		}
		
		
	}
	