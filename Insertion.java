package demo2;

import java.sql.*;

import com.gargoylesoftware.htmlunit.Cache;  
	
public class Insertion{  
	
		public static void main(String args[]){  
	try{  
	Class.forName("mysql.jdbc.driver.mysqlDriver");  
	  
	Connection con=DriverManager.getConnection("jdbc:mysql:thin:@localhost:3306:xe","root","");  
	  
	PreparedStatement stmt=con.prepareStatement("delete from Emp values(?,?.?)");  
	stmt.setInt(1,101);//1 specifies the first parameter in the query  
	stmt.setString(2,"Ratan"); 
	stmt.setInt(3,1000);
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	if(Cache.class.desiredAssertionStatus()){
		
		System.out.println("existed is boolean"+true);
		
	}
	else
	{
		System.out.println("false");
	}
	}  
	}  

