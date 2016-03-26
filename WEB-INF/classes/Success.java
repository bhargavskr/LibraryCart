import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Success extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {   
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("<html>");
    out.println("<head>");
     out.println("<title>Success</title>");
     out.println("</head>");
     out.println("<body>");
     out.println("<h2>successfully registered</h2>");
     out.println("</body></html>");
     out.close();
   }
}