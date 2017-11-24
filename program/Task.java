package program;

import java.sql.SQLException;
import java.util.Date;

import database.EmployeeTaskGetter;

public class Task {
	private String name;
	private EmployeeTaskGetter etg;
	private Date givendate;
	private Date submitdate;
	private String message;
public Task (String name,String message) {
	Date today=new Date();
    Date submit=new Date();
	this.name=name;
	this.message=message;
	this.givendate=today;
	this.submitdate=submit;
}
public Task(String name) {
	
}
public String getname(){
	return this.name;
}
public String getMessage() {
	return this.message;
}
public String getTask() throws SQLException {
	try {
	 etg=new EmployeeTaskGetter("natan");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(this.message);
    return etg.gettask().toString();
}
public String gettaskname() {
	return name;
}
public Date getgivendate() {
	return givendate;
}
public Date getsubmitdate() {
	return submitdate;
}
//done
}
