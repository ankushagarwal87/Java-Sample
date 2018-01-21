import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class context extends HttpServlet
{
ServletConfig con;
ServletContext ctx;
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
ctx=getServletContext();
con=getServletConfig();
String image=con.getInitParameter("image");
String driver=ctx.getInitParameter("driver");
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body background="+image+">"+driver+"</body></html>");
}
}