package main;

import java.sql.*;

public class Forsql {
	
	static Connection connection;
	
	
	
	public static void open()
	throws SQLException, ClassNotFoundException{
		
		//Class.forName("com.mysql.jbdc.Driver");
		//System.out.println("Driver loaded");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "lyt811");
		System.out.print("Database connected" + "\n");
	}
	
	
	public static void show()throws SQLException, ClassNotFoundException
	{
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select id,name,password,phonenumber,mail,sex,VIP from student");
		
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" +resultSet.getString(3) + "\t"
					+ resultSet.getString(4) + " \t" + resultSet.getString(5) + "\t" + resultSet.getString(6) + "\t");
			
		}
		
		
		
		
		
	}
	
	public static void close() throws SQLException
	{ 
		connection.close();
	}
	
	//----------------------以上是打开/关闭数据库
	
	public static void insert(int id,String name ,String password, String phonenumber, String mail, int sex, int VIP) throws SQLException
	{
		String insertrow = "insert into student values "
				+ "("
				+ id
				+ ",'"
				+ name
				+"','"
				+ password
				+"','"
				+phonenumber
				+"','"
				+mail
				+"',"
				+sex
				+","
				+VIP
				+")"
				;
		Statement statement = connection.createStatement();
        statement.executeUpdate(insertrow);
	}
	
	//写一个获取最大ID的方法
	public static int getid() throws SQLException
	{
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select * from student");
		resultSet.last();
		int n = resultSet.getRow();
		return n;
	}
	//写一个登陆方法 
	public static int signin(String name, String pw) throws SQLException
	{
		//String findid = "select ";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
		while(resultSet.next()  )
		{
			if(name.equals(resultSet.getString("name")))
			{
				System.out.println("name finded");
				if(pw.equals(resultSet.getString("password")))
				{
					System.out.println("success sign in");
					return 1;
				}
				else
				{
					System.out.println("wrong password");
					return 2;
				}
				
			}
			
			
		}
		System.out.println("can't find id");
		return 3;
	}
	//写一个寻找VIP的代码
	public static int findvip(String name) throws SQLException
	{
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
		while(resultSet.next()  )
		{
			if(name.equals(resultSet.getString("name")))
			{
				return resultSet.getInt("VIP");
				
			}
			
			
		}
		return 0;
	}
	
	public static void main(String args[]) throws Exception, SQLException
	
	{
		open();
		//int n = getid();
		//n++;
		//insert(n, "test", "test", "test", "test", 2, 2);
		
		
		//-------------------------for test of name (success) so we delete it--------------------
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from student");
//		
//		while(resultSet.next())
//		{
//			System.out.println(resultSet.getString("name"));
//		}
//		
		System.out.println(getid());
		
		show();
		
		
	}
	
	
	
	
	
	
	
	
	

}
