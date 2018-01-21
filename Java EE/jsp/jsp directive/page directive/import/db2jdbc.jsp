<html>
<body>

<%@ page import="java.sql.*" %>
<% try
{
Class.forName("com.ibm.db2.jcc.DB2Driver");
out.println("iop");
Connection c=DriverManager.getConnection("jdbc:db2://localhost:50001/IBM","ankush","jonty");
Statement s=c.createStatement();
out.println("ytr");
//s.executeUpdate("create table emp23(id number,name varchar(10))");
out.println("ghj");
int x=s.executeUpdate("insert into abc values('manju')");
out.println(x);
ResultSet r1=s.executeQuery("select * from abc");
while(r1.next())
		      {		
			out.println("name"+r1.getString(1));
		//	out.println("salary"+r1.getString(2));
		      }
}
catch(Exception e)
{
out.println(e);
}

%>
</body>
</html>
