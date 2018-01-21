<html>
<body>
<%!String s;
public void jspInit()
{
ServletConfig con=getServletConfig();
s=con.getInitParameter("name");
}
%>
<%String s1=config.getInitParameter("name");
out.println(s+" "+s1);
%>
</body>
</html>
