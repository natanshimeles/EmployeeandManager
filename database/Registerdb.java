package database;

import java.sql.*;


	public class Registerdb {
		private int s;
		//public static String s;
		static String dbName = "natans";
		
		static String userName =" SYS AS SYSDBA";
		
		static String password = "abuyeTSEGAYE1!";
		private Connection conn;
		public  Registerdb() throws SQLException {
			
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + dbName, userName,
					password);
			

			
			
				}	public void insert(String name,int passw) throws SQLException {
					char []tempstr=name.toCharArray();
		             String query = "insert into up values ('"; 
		             for(int i=0;i<tempstr.length;i++) {
		            	 char a=tempstr[i];
		            	 query=query+a;
		             }
		             query=query+"'"+','+'1'+')';
		             System.out.print(query);
		             
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
					
					
			  		
				}
				

	}


