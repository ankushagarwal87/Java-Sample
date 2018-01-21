import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class context2 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String s=(String)req.getAttribute("name");
out.println("<html><body>hello "+s+"</body></html>");
}
}