package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AskLeave extends Connect {

	public AskLeave() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Ask(String name) {
		String Query="insert into leave values('";
	    char[] temp=name.toCharArray();
	    for(int i=0;i<name.length();i++) {
	    	Query=Query+temp[i];
	    }
	    Query+="')";
	    System.out.print(Query);
	    Statement stmt=null;
	     try {
			stmt=conn.createStatement();
			stmt.executeQuery(Query);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getErrorCode());
		}
		
		
				
	}

}
