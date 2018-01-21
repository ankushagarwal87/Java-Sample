<html>
<body>

<%@ page import="java.rmi.*" %>
<%@ page import="java.rmi.server.*" %>
<%@ page import="my.*" %>

<%
try
{
my.MyRemote m=(my.MyRemote)Naming.lookup("rmi://localhost:1099/ankush");
System.out.println(m.add(20,89));
}
catch(Exception e)
{
System.out.println(e);
}

%>

</body>
</html>