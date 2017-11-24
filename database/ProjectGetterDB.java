package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectGetterDB extends Connect {

	public ProjectGetterDB() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getproject(String name) throws SQLException {
		String Query="select * from projects where name = '";
		for(int i=0;i<name.length();i++) {
			Query=Query+name.charAt(i);
		}
		Query=Query+"'";
		Statement stmt=null;
	     try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getErrorCode());
		}
			ResultSet rs = null;
		try {
			rs = stmt.executeQuery(Query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(rs.next()) {
			return rs.getString("about");
		}
		return null;
	}

}
