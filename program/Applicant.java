package program;

import java.sql.SQLException;

import database.Applicantdb;

public class Applicant {
	private String name;
	private String email;
	private String birthday;
	
public Applicant(String name,String email,String birthday) throws SQLException {
	this.name=name;
	this.birthday=birthday;
	this.email=email;
	apply();
}
public void apply( ) throws SQLException  {
	Applicantdb a=new Applicantdb(name,email,birthday);
	a.save();

}
/*public Applicant() {
	//do nothing just constr..
}*/
/*public void getresponse() {
	//they should check their emai for that better because they dont have account ....
	
}
*/
//done

}
