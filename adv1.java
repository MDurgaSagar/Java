import java.sql.*;

class jdbcEx
{
	public static void main(String[]args);
	{
	  String driver ="";
	  String url ="";
	  String username ="";
	  String password ="";

	  try{
		//step1
		Class.forName(driver);
		//step2
		Connection con = DriverManager.getConnection(url,username,password);
		//step3
		Statement stmt = con.createStatement();
		//step4
		stmt.executeUpdate("insert into student values(2,'sai')");
		stmt.executeUpdate("insert into student values(3,'sagar')");
		stmt.executeUpdate("insert into student values(4,'Durga')");
		//step5
		con.close();
	catch(Exception e)
	{
		System.out.println(e)
	}
}
}
		
		
		
