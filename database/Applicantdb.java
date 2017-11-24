package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Applicantdb extends Connect {
	private String name;
	private String email;
	private String birthday;

public Applicantdb(String name,String email,String birthday) throws SQLException {
		super();
		this.name=name;this.birthday=birthday;this.email=email;
		// TODO Auto-generated constructor stub
	}
public Applicantdb() throws SQLException {
	//empty constructor
	
}

public void save() {
	char []tempstr=name.toCharArray();
    String query = "insert into applicant values ('"; 
    for(int i=0;i<tempstr.length;i++) {
   	 char a=tempstr[i];
   	 query=query+a;
    }
    query=query+"'"+","+"'";
   char [] tempstr2=email.toCharArray();
   for(int i=0;i<tempstr2.length;i++) {
	   	 char a=tempstr2[i];
	   	 query=query+a;
	    }
   query=query+"'"+","+"'";
   char []tempstr3=birthday.toCharArray();
   for(int i=0;i<tempstr3.length;i++) {
	   	 char a=tempstr3[i];
	   	 query=query+a;
	    }
    query=query+"'"+")";
    
   // System.out.print(query);
   
    Statement stmt=null;
     try {
		stmt=conn.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println(e.getErrorCode());
	}
		ResultSet rs = null;
	try {
		rs = stmt.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
public ArrayList<String> getname()
{
	ArrayList<String> list=new ArrayList<String>();
	 String query = "select * from applicant"; 
	 Statement stmt=null;
     try {
		stmt=conn.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println(e.getErrorCode());
	}
		ResultSet rs = null;
	try {
		rs = stmt.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		while(rs.next()) {
				list.add(rs.getString("name"));
			}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
}
}
