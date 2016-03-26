import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Catalog extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {   
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   
   out.println("<html>");
out.println("<head><title>catalog</title></head>");
out.println("<body>");
out.println("<table cellpadding=\"58\" align=\"center\">");
out.println("<tr><th>cover page</th><th>author name</th><th>publisher</th><th>price</th><th>add</th></tr>");
out.println("<tr><td><img src=\"it1.jpg\" height=\"150\" width=\"100\" /></td><td>BALAGURU SWAMY</td><td>PEARSON</td><td>$30</td><td><button type=\"button\">add to cart</button></th></tr>"); 
out.println("<tr><td><img src=\"it2.jpg\" height=\"150\" width=\"100\" /></td><td>W.N.CHAN</td><td>MULTIMEDIA</td><td>$45</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"it3.jpg\" height=\"150\" width=\"100\" /></td><td>D.P.SHARMA</td><td>PRESSMAN</td><td>$22</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"it4.jpg\" height=\"150\" width=\"100\" /></td><td>JIM X.CHEN</td><td>PEARSON</td><td>$34</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"it5.jpg\" height=\"150\" width=\"100\" /></td><td>IAN H.WITTEN,EIBE FRANK,MARK A.HALL</td><td>PEARSON</td><td>$54</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"it6.jpg\" height=\"150\" width=\"100\" /></td><td>JACK GONSSLE</td><td>PRESSMAN</td><td>$12</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"it7.jpg\" height=\"150\" width=\"100\" /></td><td>ROGER S.PRESSMAN</td><td>S CHAND</td><td>$34</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ1.jpg\" height=\"150\" width=\"100\" /></td><td>ARTHUR H.NILSON,DAVID DARWIN,CHARLES W.DOLAN</td><td>HYPER</td><td>$23</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ2.jpg\" height=\"150\" width=\"100\" /></td><td>JAMES WEEDLING,SCOOT MCEACHRON</td><td>PEARSON</td><td>$25</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ3.jpg\" height=\"150\" width=\"100\" /></td><td>R.W.SARSBY</td><td>WOODHEAD</td><td>$60</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ4.jpg\" height=\"150\" width=\"100\" /></td><td>W.F.CHEN,J.Y.RICHARD LIEW</td><td>CRC PRESS</td><td>$30</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ5.jpg\" height=\"150\" width=\"100\" /></td><td>SEYMOUR SIMON</td><td>PRESSMAN</td><td>$65</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ6.jpg\" height=\"150\" width=\"100\" /></td><td>H.LESSMAN,R.VIEIDER</td><td>SPRINGER</td><td>$40</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"civ7.jpg\" height=\"150\" width=\"100\" /></td><td>R.C.HIBBELER</td><td>PEARSON</td><td>$45</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece1.jpg\" height=\"150\" width=\"100\" /></td><td>HANN J JASON</td><td>MULTIMEDIA</td><td>$24</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece2.jpg\" height=\"150\" width=\"100\" /></td><td>L.RICHARD</td><td>WOODHEAD</td><td>$22</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece3.jpg\" height=\"150\" width=\"100\" /></td><td>TOM DENTON</td><td>CRC PRESS</td><td>$33</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece4.jpg\" height=\"150\" width=\"100\" /></td><td>LLOYD TEMES,MITCHEL E.SCHULTZ</td><td>HYPER</td><td>$44</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece5.jpg\" height=\"150\" width=\"100\" /></td><td>SANTOS S.CUERVO</td><td>PEARSON</td><td>$45</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece6.jpg\" height=\"150\" width=\"100\" /></td><td>B.L.THERAJA</td><td>S.CHAND</td><td>$25</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"ece7.jpg\" height=\"150\" width=\"100\" /></td><td>BOYLESTAD</td><td>EXPRESS</td><td>$40</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee1.jpg\" height=\"150\" width=\"100\" /></td><td>JASON G.WESLEY</td><td>WILEY</td><td>$50</td><td><button type=\"button\">add to cart</button></th></tr>"); 
out.println("<tr><td><img src=\"eee2.jpg\" height=\"150\" width=\"100\" /></td><td>G.RAND SLOBE</td><td>TAB</td><td>$54</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee3.jpg\" height=\"150\" width=\"100\" /></td><td>SALVATORE GRAVANO</td><td>OXFORD</td><td>$45</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee4.jpg\" height=\"150\" width=\"100\" /></td><td>PETER KINGET,RANJIT</td><td>SPRINGER</td><td>$35</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee5.jpg\" height=\"150\" width=\"100\" /></td><td>ANDRIEJ M.TRZYNADLOWSKI</td><td>PEARSON</td><td>$25</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee6.jpg\" height=\"150\" width=\"100\" /></td><td>JOHN D.MCDONALD</td><td>CRC PRESS</td><td>$15</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee7.jpg\" height=\"150\" width=\"100\" /></td><td>JAIN LEE</td><td>SPRINGER</td><td>$34</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"eee8.jpg\" height=\"150\" width=\"100\" /></td><td>HARTMUT FITHR</td><td>SPRINGER</td><td>$55</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"mec1.jpg\" height=\"150\" width=\"100\" /></td><td>JOSEPH E. SHIGLEY</td><td>PEARSON</td><td>$35</td><td><button type=\"button\">add to cart</button></th></tr>"); 
out.println("<tr><td><img src=\"mec2.jpg\" height=\"150\" width=\"100\" /></td><td>CARL ROSS</td><td>CRC PRESS</td><td>$35</td><td><button type=\"button\">add to cart</button></th></tr> ");
out.println("<tr><td><img src=\"mec3.jpg\" height=\"150\" width=\"100\" /></td><td>WILLIAM H.HARRIS</td><td>MULTIMEDIA</td><td>$45</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"mec4.jpg\" height=\"150\" width=\"100\" /></td><td>L.G.KRAIGE,J.L.MERIAH</td><td>PRESSMAN</td><td>$27</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("<tr><td><img src=\"mec5.jpg\" height=\"150\" width=\"100\" /></td><td>ALAN DARBYSHIRE</td><td>2 PRESSS</td><td>$44</td><td><button type=\"button\">add to cart</button></th></tr>");
out.println("</table>");
out.println("</body>");
out.println("</html>");
   out.close();
  }
  
} 