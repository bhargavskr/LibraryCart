<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page session="true" %>
<html><body bgcolor="AliceBlue">
<% try
   {
         String name=request.getParameter("name");       
   String passw=request.getParameter("pwd");      
                                            
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  String uri="jdbc:odbc:registration";               
   Connection con=DriverManager.getConnection(uri,"","");
   Statement st=con.createStatement(); 
Statement st1=con.createStatement();   
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
    {    String str1="delete * from cart";
	     st1.executeUpdate(str1);
	
	out.println("login success");
							  session.putValue("n",name);
							  }
							  else {
		        out.println(" please register");
				}
           con.close();
    }		
    catch(Exception e)
    {
          out.println(e);
    }%>
</body></html> 
    