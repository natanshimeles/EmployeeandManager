 package database;

import java.sql.SQLException;
import java.sql.Statement;
import program.Task;

public class SaveTaskintodb extends Connect {
    private Task t;
	public SaveTaskintodb() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
    public SaveTaskintodb(Task t) throws SQLException {
    	this.t=t;
    	
    }
    
    public void save() {
    	char [] tempstr = t.gettaskname().toCharArray();
        String query = "insert into task values ('"; 
        for( int i = 0; i < tempstr.length; i++) {
       	 char a=tempstr[i];
       	 query=query+a;
        }
        query=query+"'"+","+"'";
       char[] tempstr2 = null;
	try {
		tempstr2 = t.getTask().toCharArray();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       for(int i=0;i<tempstr2.length;i++) {
    	   	 char a=tempstr2[i];
    	   	 query=query+a;
    	    }
       query=query+"'"+")";
       System.out.println(query);
       //query="insert into task values('nat','natan')";
       System.out.println(query);
       // System.out.print(query);
       
        Statement stmt=null;
         try {
    		stmt=conn.createStatement();
    		stmt.executeQuery(query);
    	} catch (SQLException e) {
    		e.printStackTrace();
    		System.out.println(e.getErrorCode());
    		
    	}
    		
    }
}
