import java.sql.*;
import java.util.*;

class vikdb
{
	public static void main(String args[])
	{
	     try
	     {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:mydsn");
		String t1="roxy";
		int t2=35000;

		Statement s=c.createStatement();
		int x=s.executeUpdate("insert into table2 values('"+t1+"',"+t2+")");
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
          }
}		