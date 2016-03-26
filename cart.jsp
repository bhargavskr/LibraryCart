<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" session="true"%>
<html><body bgcolor="AliceBlue"><table align="center" cellpadding="30" border=1>
<% String sess=(String)session.getValue("n");

   if(sess==null)
   {
         out.println(" please login ");
	}
   else
	{
	    
      try
   {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  String uri="jdbc:odbc:registration";               
   Connection con=DriverManager.getConnection(uri,"","");
   Statement st=con.createStatement();    
 Statement st1=con.createStatement();   
    Statement st2=con.createStatement();
   String str="select * from catalog";
   ResultSet rs=st.executeQuery(str);            
  %>
	<tr><th>book name</th><th>price</th><th>quantity</th><th>amount</th></tr>
	<%while(rs.next())
	{
	     String book=rs.getString(1); 
		 int price=rs.getInt(4);
		 int id=rs.getInt(5);
		
				  String str2="select sum(quantity) from cart where id="+id;
				  
		  ResultSet rs2=st1.executeQuery(str2);
		 
		  if(rs2!=null)
		  while(rs2.next())
		  {
          int a=rs2.getInt(1);
		 
		  int total=a*price;
		  if(a!=0)
		  {
		  out.println("<tr><td>"+book+"</td><td>"+price+"</td><td>"+a+"</td><td>"+total+"</td></tr>");
		  }
		  }
		  }
     	
		 
		  String str3="select sum(amount) from cart";
		  ResultSet rs3=st2.executeQuery(str3);
		  while(rs3.next())
		   out.println("<tr><td colspan=\"3\">TOTAL AMOUNT</td><td>"+rs3.getInt(1)+"</td></tr>");
	con.close();
   }  	
	catch(Exception e)
	{
	    out.println(e);
    }
   }
%>
</table>
</body></html>