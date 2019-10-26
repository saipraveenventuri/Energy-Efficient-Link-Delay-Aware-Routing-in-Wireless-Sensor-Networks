import java.sql.Connection;
import java.sql.DriverManager;


public class DBCon 
{
	static Connection con;
	public Connection getConnection()
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=src\\Database.mdb");
		
		System.out.println("Connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}

}
