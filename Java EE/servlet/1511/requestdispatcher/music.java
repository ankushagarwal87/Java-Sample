import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class music extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>let the music play "+req.getAttribute("name"));

out.println("</body></html>");
}
} 