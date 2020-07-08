package Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector
{
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static Connection conn;

	private static void init()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getCon()
	{
		init();
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
		Connection con = getCon();
		System.out.println("확인");

	}


}