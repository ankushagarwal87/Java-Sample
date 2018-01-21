import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class welcome extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>welcome");

out.println("</body></html>");
}
}