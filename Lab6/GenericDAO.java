import java.sql.*;

public abstract class GenericDAO 
{
	static Connection con;
	public abstract void createTable( ) throws SQLException;
	abstract void insertData(AddressBook addBook) throws SQLException;
	abstract void delData(String name) throws SQLException;
	abstract void updateData(AddressBook addBook) throws SQLException;
	abstract AddressBook searchData(String name) throws SQLException;
	
	GenericDAO()
	{
		createConnection();	
	}
	
	void createConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String uname="root";
			String passwd="";
			String conString="jdbc:mysql://localhost/mydb?autoReconnect=true&useSSL=false";
			try
			{
				con=DriverManager.getConnection(conString,uname,passwd);
				System.out.println("connected");
				System.out.println("Opened database successfully");
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
