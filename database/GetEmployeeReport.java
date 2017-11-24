package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import program.Report;

public class GetEmployeeReport extends Connect {

	public GetEmployeeReport() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
  public Report getReport(String name) throws SQLException {
	  String query="select * from deptreport where name='";
	  String rep=null;
	  char [] temp=name.toCharArray();
	  for(char r:temp) {
		  query=query+r;
	  }
	  query+="'";
	  System.out.println(query);
	  Statement stmt=null;
      try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(rs.next()) {
			//System.out.println(rs.getString("message"));
			rep= rs.getString("report");
			break;
		}
		Report r=new Report(rep);
		System.out.print(r.getreport());
		return r;
	}
	  
  }


