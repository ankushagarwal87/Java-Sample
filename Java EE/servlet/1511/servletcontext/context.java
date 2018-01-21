import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class context extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>14");
try
{
req.setAttribute("name","ankush");
ServletContext ctx=getServletContext();
ServletContext ctx1=ctx.getContext("http://localhost:7001/context");
RequestDispatcher rd=ctx1.getRequestDispatcher("/sonu");
rd.include(req,res);
}
catch(Exception e)
{
out.println("rd");
}
out.println("21</body></html>");
}
}