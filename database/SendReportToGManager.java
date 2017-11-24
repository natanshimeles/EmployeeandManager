package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import program.Report;

public class SendReportToGManager extends Connect{

	public SendReportToGManager() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void savereport(String name ,Report r) {
		String query="insert into deptreport values('";
		char []temp1=name.toCharArray();
		char []temp2=r.getreportdetail().toCharArray();
		for(int i=0;i<temp1.length;i++) {
			query+=temp1[i];
		}
		query+="','";
		for(int i=0;i<temp2.length;i++) {
			query=query+temp2[i];
		}
		query+="')";
		System.out.print(query);
		
		
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

}
