<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" session="true"%>

<%
String sess=(String)session.getValue("n");

   if(sess!=null)
   {
         out.println(" already logged in ");
	}
   else
	{ try{   
  String name=request.getParameter("name");       
   String passw=request.getParameter("pwd");      
   String mail=request.getParameter("mail");       
   String ph=request.getParameter("ph");         
                                           
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  String uri="jdbc:odbc:registration";               
   Connection con=DriverManager.getConnection(uri,"","");
   Statement st=con.createStatement();           
  String str="select stu_name,password from register";
   ResultSet rs=st.executeQuery(str);            
   int f=0;                                      
   while(rs.next())                              
   {                                             
   if(name.equals(rs.getString(1)))              
        if(passw.equals(rs.getString(2)))        
           f=1;                                  
   }                                             
    if(f==1)                                     
    { %><html><body bgcolor="AliceBlue">
         <h2>sorry u are already registered <h2><br/>
         <a href="http://localhost:4040/6prog/register4" >press register to retry</a><br/>
		 <%Statement st1=con.createStatement();           
  String str1="select stu_name,email_id,phone_no from register";
   ResultSet rs1=st1.executeQuery(str1);%>            
  <table align="center">
   <%while(rs1.next()) 
   {
      out.println("<tr><td>"+rs1.getString(1)+"</td><td>"+rs1.getString(2)+"</td><td>"+rs1.getInt(3)+"</td></tr>");
	}%>
	</table></body></html>
 <%  }                                          
    else{                                      
    Statement st2=con.createStatement();    
     	
    String str2="insert into register values('"+name+"','"+passw+"','"+mail+"','"+ph+"')";
	
     st2.executeUpdate(str2);                  
    out.println("details are updated ino database");
   }con.close();                                  
  }                                              
  catch(Exception e)                             
 {                                               
     out.println(e);
 }
 }%>                                               
  