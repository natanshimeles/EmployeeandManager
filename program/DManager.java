package program;

import java.sql.SQLException;

import database.GetEmployeeReport;
import database.ProjectGetterDB;
import database.Registerdb;
import database.SaveTaskintodb;
import database.SendReportToGManager;
import database.SendRepottodeptManagerDB;

public class DManager extends Employee{
	private Registerdb rd;

	public DManager(String name, String id,Department dep) {
		super(name, id,dep);
		// TODO Auto-generated constructor stub
	}
   public void sendtask(String name,String message) {
	   try {
		SaveTaskintodb s= new SaveTaskintodb(new Task(name,message));
		s.save();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public String getProject(String name) throws SQLException {
	   ProjectGetterDB pd=new ProjectGetterDB();
	   String s =pd.getproject(name);
	   return s;
	   
   }
   
   public Report getreport(String Ename) throws SQLException {
	   
		Report r= new Report(new GetEmployeeReport().getReport(Ename).getreport());
		
		return r;
	}
   public void sendreporttomm(Report r) throws SQLException {
	   SendReportToGManager  sr=new SendReportToGManager ();
		sr.savereport(super.getemployeename(), r);
   }
   public String searchemployee() {
	   String s="";
	   //search for employee only in the same dept;
	   return s;
	   
   }
}
