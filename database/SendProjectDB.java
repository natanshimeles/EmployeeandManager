package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SendProjectDB extends Connect{

	public SendProjectDB() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void save(String name,String about) throws SQLException {
		String query="insert into projects values('";
		for(int i=0;i<name.length();i++) {
			query=query+name.charAt(i);
			
		}
		query=query+"','";
		for(int i=0;i<about.length();i++) {
			query=query+name.charAt(i);
			
		}
		query=query+"')";
		System.out.print(query);
		Statement stmt=null;
	     try {
			stmt=conn.createStatement();
			stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getErrorCode());
		}
			
		
		
		
		
	}

}
