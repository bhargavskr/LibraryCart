import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class LoginForm10 extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {   
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   Enumeration para=getServletConfig().getInitParameterNames();
   while(para.hasMoreElements())
   {
         String name=(String)para.nextElement();
         String value=(String)getServletConfig().getInitParameter(name);
         Cookie hi=new Cookie(name,value);
         res.addCookie(hi);
                              
   }
 out.println("<html>");
 out.println("<head><title>LoginForm2</title></head>");
 out.println("<body bgcolor=\"AliceBlue\">");
 out.println("<form name=\"login\" method=\"post\"");
 out.println("<table align=\"center\" cellpadding=\"10\">");
 out.println("<tr><th><img src=\"g.jpeg\" width=\"100\" height=\"100\" /></th></tr>");
 out.println("<tr><th><h1>GOKARAJU RANGARAJU INSTITUTE OF ENGINEERING TECHNOLOGY</h1></th></tr>");
 out.println("<tr><th><h3>LOGIN</h3></th></tr>");
 out.println("<tr><th>username:<input type=\"text\" name=\"name\" /><br/></th></tr>");
 out.println("<tr><th>Password:<input type=\"password\" name=\"pwd\" /><br/></th></tr>");
 out.println("<tr><th><input type=\"submit\" value=\"Submit\" name=\"submit\" />");
 out.println("<input type=\"reset\" value=\"reset\" name=\"reset\" /><br/></th></tr></table></form>");
 out.println("</body></html>");
   out.close();
  }
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
  {
     int count=0;
     res.setContentType("text/html");
     PrintWriter out=res.getWriter();
     Cookie[] cook=req.getCookies();
     String name=req.getParameter("name");
     String value=req.getParameter("pwd");
     out.println("<html><body>");
     for(int i=0;i<4;i++)
     {
        if((cook[i].getName().equals(name))&&(cook[i].getValue().equals(value)))
        {
            out.println("<h2>welcome</h2>"+name);
            break;
        }
        else
        {
           count++;   
        }

     }
       if(count==4)
       {
           
           out.println(" <h2> you are not a authenticated user </h2><br /><h2> please register </h2> ");
       }

    out.println("</html></body>");
    out.close();
  }     
} 