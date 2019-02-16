import java.sql.*;
import java.util.ArrayList;

public class DAO extends GenericDAO
{
	int maxRows=0;
	DAO()
	{
		/*try {
			createTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void createTable() throws SQLException
	{
		Statement stmt= con.createStatement();
		String sql="CREATE TABLE addressBook "+
					"(Name varchar(30) PRIMARY KEY, "+
					"Address varchar(30) NOT NULL, "+
					"Phone varchar(30) NOT NULL, "+
					"Email varchar(30) NOT NULL)";
		
		stmt.execute(sql);
		stmt.close();
		System.out.println("Table created successfully");		
	}
	
	public void insertData(AddressBook addBook) throws SQLException
	{
		String sql="INSERT INTO addressBook (Name, Address,Phone,Email) "+
					"values (?,?,?,?)";
		PreparedStatement preStmt=con.prepareStatement(sql);
		preStmt.setString(1, addBook.name);
		preStmt.setString(2, addBook.address);
		preStmt.setString(3, addBook.phone);
		preStmt.setString(4, addBook.email);
		System.out.println(preStmt.executeUpdate()+" row(s) update.");
		preStmt.close();
	}
	
	AddressBook searchData(String name) throws SQLException
	{
		String sql="SELECT * FROM addressBook WHERE name=?";
		PreparedStatement preStmt=con.prepareStatement(sql);
		preStmt.setString(1, name);
		ResultSet rs;
		rs=preStmt.executeQuery();
		rs.next();
		AddressBook addBook=new AddressBook(name, rs.getString(2),rs.getString(3), rs.getString(4));
		rs.close();
		preStmt.close();
		return addBook;
	}
	
	void updateData(AddressBook addBook) throws SQLException
	{
		String sql="UPDATE addressBook SET address=? , phone=?, email=? "
				+ " WHERE name=?";
		PreparedStatement preStmt=con.prepareStatement(sql);
		preStmt.setString(1, addBook.getAddress());
		preStmt.setString(2, addBook.getPhone());
		preStmt.setString(3, addBook.getEmail());
		preStmt.setString(4, addBook.getName());
		int row=preStmt.executeUpdate();
		System.out.println(row+ " row(s) updated");
		preStmt.close();
	}
	
	void delData(String name) throws SQLException
	{
		String sql="DELETE FROM addressBook WHERE name=?";
		PreparedStatement preStmt=con.prepareStatement(sql);
		preStmt.setString(1, name);
		int row=preStmt.executeUpdate();
		System.out.println(row+ " row(s) updated");
		preStmt.close();
	}

	ArrayList<AddressBook> getList() throws SQLException
	{
		ResultSet rs;
		String sql="SELECT * FROM addressBook";
		Statement stmt=con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=stmt.executeQuery(sql);
		ArrayList<AddressBook> addBook=new ArrayList<AddressBook>();
		while(rs.next())
			addBook.add((new AddressBook(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4))));
		return addBook;
	}
}
