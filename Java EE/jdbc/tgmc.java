import java.util.*;
import java.sql.*;

class tgmc
{
   
	public static void main(String args[])
	{
		try
		{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c=DriverManager.getConnection("jdbc:db2://localhost:50001/IBM","ankush","jonty");
		String t1="sam";
		int t2=30000;
		String t3="john";
		int t4=25000;	
		Statement s=c.createStatement();
		//int x=s.executeUpdate("update Table2 set name='"+t1+"' where salary="+t2+" ");
		//int y=s.executeUpdate("insert into Table2 values('"+t3+"',"+t4+")");
		ResultSet r1=s.executeQuery("select * from abc");


		
		
		      while(r1.next())
		      {		
			System.out.println("name"+r1.getString(1));
		//	System.out.println("salary"+r1.getString(2));
		      }
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}