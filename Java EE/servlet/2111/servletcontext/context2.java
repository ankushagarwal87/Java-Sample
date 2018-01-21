import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class context2 extends HttpServlet
{
ServletContext ctx;
ServletConfig con;
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
String image=con.getInitParameter("image");
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body background="+image+">hello"+ctx.getInitParameter("driver")+"</body></html>");
}
}