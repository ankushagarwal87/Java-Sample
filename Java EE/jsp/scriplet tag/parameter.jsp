<html>
<body style="background-color:red">
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
RequestDispatcher rd=request.getRequestDispatcher("demo.jsp");
rd.include(request,response);
if(name.equals("ankush") && pass.equals("sonu"))
out.println("valid");
else
out.println("invalid");
%>
</body>
</html>