<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<html><body><table align="center" >
<% try
   {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  String uri="jdbc:odbc:registration";               
   Connection con=DriverManager.getConnection(uri,"","");
   Statement st=con.createStatement();           
  String str="select stu_name,email_id,phone_no from register";
   ResultSet rs=st.executeQuery(str);            
   while(rs.next()) 
   {
      out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
	}
	
	con.close();
   }  	
	catch(Exception e)
	{
	    out.println(e);
    }
%>
</table>
</body></html>
   