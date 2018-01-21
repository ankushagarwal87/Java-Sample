import java.sql.*;
import java.util.*;

class vikdb2
{
	public static void main(String args[])
	{
	     try
	     {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:obc:mydsn");
		String t1="rajendra";
		int t2=35000;

		Statement s=c.createStatement();
		int y=s.executeUpdate("Create table emp(name varchar(10),salary number(7))");
		int x=s.executeUpdate("Insert into table2 values('"+t1+"',"+t2+")");
		ResultSet r1=s.executeQuery("select * from table2"); 
		
			while(r1.next())
			{
				System.out.println("name="+r1.getString(1));
				System.out.println("salary="+r1.getString(2));
			}
	     }
  	    
	     catch(SQLException e)
	     {
			e.printStackTrace();
	     }
}	}	