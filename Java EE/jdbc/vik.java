import java.util.*;
import java.sql.*;

class vik
{
   
	public static void main(String args[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:mydsn");
		String t1="sam";
		int t2=30000;
		String t3="john";
		int t4=25000;	
		Statement s=c.createStatement();
		int x=s.executeUpdate("update Table2 set name='"+t1+"' where salary="+t2+" ");
		int y=s.executeUpdate("insert into Table2 values('"+t3+"',"+t4+")");
		ResultSet r1=s.executeQuery("select * from Table2");


		
		
		      while(r1.next())
		      {		
			System.out.println("name"+r1.getString(1));
			System.out.println("salary"+r1.getString(2));
		      }
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}