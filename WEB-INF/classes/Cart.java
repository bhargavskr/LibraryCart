import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Cart extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {   
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("<html><head><title>cart</title></head><body><table align=\"center\" cellpadding=\"60\"><tr><th>book name</th><th>price</th><th>quantity</th><th>amount</th></tr><tr><td>JAVA 2<td>$54</td><td>2</td><td>$108</td><tr><tr><td>XML BIBLE<td>$30</td><td>1</td><td>$30</td><tr><tr><td colspan=\"3\" align=\"center\">TOTAL AMOUNT</td><td>$138</td></tr></table></body></html>");
   out.close();
  }
  
} 