package program;

import java.util.Date;

public class Employee {
	private String name;
	private Date hiredate;
	private Date today;
	private String id;
	private Department dep;
	private Task t;
	//we will use the constructor foe employee query

	public Employee(String name,String id,Department dp) {
		today=new Date();
              this.id=id;
              this.name=name;
              this.hiredate=today;
              this.dep=dp;
	}
	
	public String getemployeeid() {
		return id;
	}
	public String getemployeename() {
		return name;
		
	}
	public Date getemployeehiredate() {
		return hiredate;
	}
	public Employee() {
		//do nothing
	}
//done
}
