<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" session="true"%>


<html><body bgcolor="AliceBlue">
<% String sess=(String)session.getValue("n");

   if(sess==null)
   {
         out.println(" please login ");
	}
   else
	{
	    try
		{  int i=1;
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             String uri="jdbc:odbc:registration";               
               Connection con=DriverManager.getConnection(uri,"","");
              Statement st=con.createStatement();           
                String str="select * from catalog";
                 ResultSet rs=st.executeQuery(str);%>
                    <table align="center">	
                    <tr><th>book name</th><th>author</th><th>publisher</th><th>price</th><th>add</th></tr>					
                    <% while(rs.next()) 
					{
					   out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td>");%>
					   <td><form action="cart1.jsp"><input type="hidden" name="id" value="<%=i%>"/><input type="submit" value="add to cart"/></form></td></tr>
					  <% i++;
					}%>
					</table>
                   <%con.close();
         }
         catch(Exception e)
		 {
		     out.println(e);
	     }
	}%>
</body></html>
    	
		 
    	 