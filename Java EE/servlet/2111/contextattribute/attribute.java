import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class attribute extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
ServletContext ctx=getServletContext();
Integer count=(Integer)ctx.getAttribute("count");
if(count==null)
{
count=new Integer(0);
}
count=new Integer(count.intValue()+1);
ctx.setAttribute("count",count);
out.println(count.intValue());
}
}