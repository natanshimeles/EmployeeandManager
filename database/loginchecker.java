package database;

import java.sql.*;


	public class loginchecker {
		private int s;
		//public static String s;
		static String dbName = "natans";
		
		static String userName =" SYS AS SYSDBA";
		
		static String password = "abuyeTSEGAYE1!";
		private Connection conn;
		public  loginchecker() throws SQLException {
			
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + dbName, userName,
					password);
			

			
			
				}	public void query(String name,int password) throws SQLException {
					char []tempstr=name.toCharArray();
		             String query = "select * from up where name='"; 
		             for(int i=0;i<tempstr.length;i++) {
		            	 char a=tempstr[i];
		            	 query=query+a;
		             }
		             query=query+"'";
			         Statement stmt=null;
			          try {
						stmt=conn.createStatement();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			  		ResultSet rs = null;
					try {
						rs = stmt.executeQuery(query);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					while(rs.next()) {
			  		 s=rs.getInt("password");
			  		
			  		}
					if(s==password) {
						System.out.println("you are now connected");
					}
					else {
						System.out.println("Wrong password");
					    
					}
			  		
				}
				

	}


