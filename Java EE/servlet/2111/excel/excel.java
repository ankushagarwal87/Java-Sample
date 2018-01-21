import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class excel extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter out=res.getWriter();
res.setContentType("application/vnd.ms-excel");
out.println("names \t runs \t balls \t four");
out.println("rahul \t 200 \t 400 \t 25");
}
}