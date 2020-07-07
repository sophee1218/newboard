package Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector
{
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static Connection conn;

	private static void init()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OrackeDriver");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection()
	{
		if (conn == null)
		{
			try
			{
				conn = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void close()
	{
		if (conn != null)
		{
			try
			{
				conn.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		conn = null;
	}

	public static void main(String[] args)
	{
		Connection con = getConnection();
		System.out.println("확인");

	}

}