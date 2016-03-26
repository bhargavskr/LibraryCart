import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Successlog extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {   
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("<html>");
    out.println("<head>");
     out.println("<title>Successlog</title>");
     out.println("</head>");
     out.println("<body>");
     out.println("<h2>successfully logged in</h2>");
     out.println("</body></html>");
     out.close();
   }
}