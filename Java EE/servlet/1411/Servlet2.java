import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Servlet2 extends HttpServlet
{



/*public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
if(name.equals("ducat") && pass.equals("ducat"))
out.println("user is valid through service");
else
out.println("user is invalid through service");
out.println("</body></html>");
}
*/



public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:Database4");
Statement s=c.createStatement();
int x=s.executeUpdate("insert into student values('"+name+"','"+pass+"')");
ResultSet rs=s.executeQuery("select * from student");
while(rs.next())
{
out.println(rs.getString(1));
out.println(rs.getString(2));
out.println("<br>");
}
}
catch(Exception e)
{
out.println("error");
}
if(name.equals("ducat") && pass.equals("ducat"))
out.println("user is valid through post");
else
out.println("user is invalid through post");
out.println("</body></html>");
}




public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
if(name.equals("ducat") && pass.equals("ducat"))
out.println("user is valid through get");
else
out.println("user is invalid through get");
out.println("</body></html>");
}

}