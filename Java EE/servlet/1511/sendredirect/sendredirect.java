import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class sendredirect extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>hello");
res.sendRedirect("http://localhost:7001/myservlet3/index.html");
out.println("</body></html>");
}
}