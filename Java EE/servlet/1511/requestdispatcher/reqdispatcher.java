import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class reqdispatcher extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>wanna love");
try
{
req.setAttribute("name","ankush");
ServletContext ctx=getServletContext();
ServletContext ctx1=ctx.getContext("http://localhost:7001/reqdispatcher");
RequestDispatcher rd=ctx1.getRequestDispatcher("/tinu");
rd.include(req,res);
}
catch(Exception e)
{
out.println("rd");
}
out.println("in the end</body></html>");
}
} 