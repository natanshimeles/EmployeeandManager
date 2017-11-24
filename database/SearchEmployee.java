package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import program.Department;
import program.Employee;
import program.NormalEmployee;

public class SearchEmployee extends Connect {
  private String name;
  private String id;
  private String position;
	public SearchEmployee() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchEmployee(String name,String id,String position) throws SQLException {
		this.id=id;
		this.name=name;
		this.position=position;
	}
	public Employee search() throws SQLException {
		String query = null;
		NormalEmployee normalemployee =null;
		if(this.name!=null) {
			char []tempstr=name.toCharArray();
			query="select * from employee where name='";
			 for(int i=0;i<tempstr.length;i++) {
			   	 char a=tempstr[i];
			   	 query=query+a;
			    }
			    query=query+"'";
		}
		
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
		String employeename=null;
		String employeeposition=null;
		String employeeid=null;
		String employeedepartment=null;
		Department dept=null;
        while(rs.next()) {
        	employeename=rs.getString("name");
        	employeeposition=rs.getString("position");
        	employeeid=rs.getString("id");
        	employeedepartment=rs.getString("dept");
  		}
        dept=new Department(employeedepartment);
        Employee e=new Employee(employeename,employeeid,dept );
	   
		return e;
	}
	
	

}
