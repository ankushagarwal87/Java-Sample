<html>
<body>

<%@ page import="java.sql.*" %>
<% try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
out.println("iop");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ankush");
Statement s=c.createStatement();
out.println("ytr");
//s.executeUpdate("create table emp23(id number,name varchar(10))");
out.println("ghj");
int x=s.executeUpdate("insert into emp231 values(50,'manju')");
out.println(x);
}
catch(Exception e)
{
out.println(e);
}

%>
</body>
</html>
