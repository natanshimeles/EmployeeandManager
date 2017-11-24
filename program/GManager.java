package program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


import database.Applicantdb;
import database.GetDMReport;
import database.SearchEmployee;
import database.SeePeopleAskForLeave;
import database.SendProjectDB;

public class GManager extends Employee {
private String employeename;
private String employeeid;
private Date hiredate;
public GManager(String name, String id,Department dep) {
		super(name, id, dep);
		
	}
public GManager() {
	 // do nothing
}
	
    
	public void registeremployee() {
		//hire applicant a save his file into db  get his file 
	}
	public String getEmployeename() {
		return employeename;
	}
	public String getemployeeid() {
		return employeeid;
	}
	public Date gethiredate() {
		return hiredate;
	}
	/*public void sendProject(String name,String about) throws SQLException {
		SendProjectDB spdb =new SendProjectDB();
		spdb.save(name, about);
	}*/
	public Report getreport(String DMname) {
		Report r = null;
		try {
			r = new Report(new GetDMReport().getReport(DMname).getreport());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
	}
	 
	 public ArrayList<String> seenewappilcant() throws SQLException {
		 Applicantdb ad=new Applicantdb();
		 ArrayList<String> list=ad.getname();
		  return list;
		 
		 
	 }
	
	 public Employee search(String name,String id,String position) throws SQLException {
		 SearchEmployee se=new SearchEmployee(name,id,position);
		 Employee ne=se.search();
		// System.out.print(ne.getemployeename());
		 return ne;
	 }
	 public ArrayList<Employee> seeleave() throws SQLException {
		
	  SeePeopleAskForLeave a=new SeePeopleAskForLeave();
	  ArrayList<Employee> ae =a.see() ;
		 return ae;
	 }
}

