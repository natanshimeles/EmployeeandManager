package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Connect {
	static String dbName = "natans";
	//System.out.println("Enter UserName");
	static String userName =" SYS AS SYSDBA";
	//System.out.println("Enter Password");
	static String password = "abuyeTSEGAYE1!";
	protected Connection conn;
	public Connect() throws SQLException {
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + dbName, userName,
				password);

}}
