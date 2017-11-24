package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import program.Employee;

public class SeePeopleAskForLeave extends Connect {

	public SeePeopleAskForLeave() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Employee> see () throws SQLException {
		ArrayList<Employee> em=new ArrayList<Employee>();
		String Query="select * from leave";
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
			Employee employee=new Employee(rs.getString("name"),null,null);
			em.add(employee);
			
		}
		return em;
		
	}

}
