import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class header extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
PrintWriter out=res.getWriter();
res.setContentType("text/html");
Enumeration e=req.getHeaderNames();
while(e.hasMoreElements())
{
String name=(String)e.nextElement();
String value=req.getHeader(name);
out.println(name+" "+value);
out.println("<br>");
}
}
}