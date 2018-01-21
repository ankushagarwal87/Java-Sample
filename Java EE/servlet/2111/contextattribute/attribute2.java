import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class attribute2 extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
ServletContext ctx=getServletContext();

out.println(ctx.getAttribute("count"));
}
}