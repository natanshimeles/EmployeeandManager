package program;

import java.sql.SQLException;
import java.util.Date;

import database.AskLeave;
import database.EmployeeTaskGetter;
import database.SendRepottodeptManagerDB;

public class NormalEmployee extends Employee {
	public NormalEmployee(String name, String id, Department dp,String position) {
		super(name, id, dp);
		this.postion=position;
		// TODO Auto-generated constructor stub
	}
	private String name;
	private Date hiredate;
    private String id;
    private String postion;
	//we will use the constructor foe employee query
	public NormalEmployee(String name) {
		this.name=name;
	}
	public String getemployeeid() {
		return this.id;
	}
	public String getemployeename() {
		return this.name;
		
	}
	public Date getemployeehiredate() {
		return hiredate;
	}
	public String recivetask(String ename) throws SQLException {
		EmployeeTaskGetter etg=new EmployeeTaskGetter(ename);
		String s= etg.gettask();
		System.out.print(s);
		return s;
		
	}
	
	
	public void sendreport(Report r) throws SQLException {
		SendRepottodeptManagerDB  sr=new SendRepottodeptManagerDB ();
		sr.savereport(super.getemployeename(), r);
		
		
		
	
	}
	public void askforleave(String name) throws SQLException {
		System.out.print("hello");
		AskLeave a =new AskLeave();
		a.Ask(name);
		
	}

}
