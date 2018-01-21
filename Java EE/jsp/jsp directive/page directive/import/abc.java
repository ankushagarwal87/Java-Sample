
import java.sql.*;

import java.io.*;


import javax.servlet.*;
import javax.servlet.http.*;


 public class abc extends HttpServlet  {
   
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			
			out.println("1");
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		out.println("2");
		Connection c=DriverManager.getConnection

("jdbc:db2://localhost:50001/IBM","ankush","jonty");
		out.println("3");
		String t1="sam";
		int t2=30000;
		String t3="john";
		int t4=25000;	
		Statement s=c.createStatement();
		out.println("4");
		//int x=s.executeUpdate("update Table2 set name='"+t1+"' where salary="+t2+" ");
		//int y=s.executeUpdate("insert into Table2 values('"+t3+"',"+t4+")");
		ResultSet r1=s.executeQuery("select * from abc");
		out.println("5");

		
		
		      while(r1.next())
		      {		
		out.println("name"+r1.getString(1));
		//	System.out.println("salary"+r1.getString(2));
		      }
		}

		catch(Exception e)
		{
			out.println(e);
		}
	
	}   	  	    
}