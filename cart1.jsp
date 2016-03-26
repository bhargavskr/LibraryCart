<%@ page import="java.io.*" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.lang.*"%>

 <%try{      int n=Integer.parseInt(request.getParameter("id"));
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             String uri="jdbc:odbc:registration";               
               Connection con=DriverManager.getConnection(uri,"","");
              Statement st=con.createStatement();          
              Statement st1=con.createStatement();		
                String str="select * from catalog where id="+n;
                 ResultSet rs=st.executeQuery(str); 
				 rs.next();
				 
				       String s1=rs.getString(1);
					   String s2=rs.getString(2);
					
					   int s3=rs.getInt(4);
					   String str1="insert into cart values('"+s1+"',"+s3+",1,"+s3+","+n+")";
					 st1.executeUpdate(str1);
			    		   
				con.close();
        }catch(Exception e)
{
        out.println(e);
}%>
<jsp:forward page="catalognew.jsp"/>
