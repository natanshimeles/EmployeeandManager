package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTaskGetter extends Connect {

	String name;
	public EmployeeTaskGetter() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeTaskGetter(String name) throws SQLException{
		this.name=name;
		gettask();
	}
	public String gettask() throws SQLException {
		String s="select message from task where name = '";
		char[] cname=this.name.toCharArray();
		for(int i=0;i<cname.length;i++) {
			s=s+cname[i];
		}
		s=s+"'";
		System.out.println(s);
		Statement stmt=null;
        try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(rs.next()) {
			//System.out.println(rs.getString("message"));
			return rs.getString("message");
		}
		return "null";
	}
	}

