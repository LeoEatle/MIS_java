package main;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Foraccess {
	static java.sql.Connection conn;

	 public static void main(String args[])
	   {
		 try {
	            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
	            String url = "jdbc:Access:///c:/a/db.mdb";
	            conn = DriverManager.getConnection(url, "", "");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	     
	   }
}
