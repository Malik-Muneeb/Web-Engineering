import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;

public class Listener implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2496577321746534639L;
	
	JButton btnArray[]=new JButton[6];
	JTextField tfArray[]=new JTextField[4];
	ArrayList<AddressBook> addBook=new ArrayList<AddressBook>();
	int iter=0;
	boolean isGetData=false;
	

	Listener()
	{

	}
	Listener(JButton btnTempButton[], JTextField tfTempField[])
	{
		this.btnArray=btnTempButton;
		this.tfArray=tfTempField;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnArray[0])
		{
			AddressBook addBook=new AddressBook(tfArray[0].getText(),tfArray[1].getText(),tfArray[2].getText(),tfArray[3].getText());
			DAO obj=new DAO();
			try 
			{
				obj.insertData(addBook);
			} 
			catch (SQLException excep) 
			{
				excep.printStackTrace();
			}
			isGetData=false;
		}
		else if(e.getSource()==btnArray[4])
		{
			AddressBook addBook=new AddressBook();
			try
			{
				DAO obj=new DAO();
				addBook=obj.searchData(tfArray[0].getText());
				tfArray[1].setText(addBook.getAddress());
				tfArray[2].setText(addBook.getPhone());
				tfArray[3].setText(addBook.getEmail());
			}
			catch(Exception excep)
			{
				System.out.println(excep);
			}
			isGetData=false;
		}
		else if(e.getSource()==btnArray[2])
		{
			DAO obj=new DAO();
			AddressBook addBook = new AddressBook(tfArray[0].getText(),tfArray[1].getText(),tfArray[2].getText(),tfArray[3].getText());
			try
			{
				obj.updateData(addBook);
			}
			catch(Exception excep)
			{
				System.out.println(excep);
			}
			isGetData=false;
		}
		else if(e.getSource()==btnArray[1])
		{
			DAO obj=new DAO();
			try
			{
				obj.delData(tfArray[0].getText());
			}
			catch(Exception excep)
			{
				System.out.println(excep);
			}
			isGetData=false;
		}
		else if(e.getSource()==btnArray[5])
		{
			DAO obj=new DAO();
			try
			{	
				if(!isGetData)
				{
					addBook=obj.getList();
					iter=0;
					isGetData=true;
				}
				else if(iter<addBook.size()-1)
					++iter;

				AddressBook addBookObj=new AddressBook();
				addBookObj=addBook.get(iter);
				tfArray[0].setText(addBookObj.getName());
				tfArray[1].setText(addBookObj.getAddress());
				tfArray[2].setText(addBookObj.getPhone());
				tfArray[3].setText(addBookObj.getEmail());
			}
			catch(Exception excep)
			{
				System.out.println(excep);
			}
		}
		else if(e.getSource()==btnArray[3])
		{
			DAO obj=new DAO();
			try
			{
				if(!isGetData)
				{
					addBook=obj.getList();
					iter=0;
					isGetData=true;
				}
				else if(iter>0)
					--iter;

				AddressBook addBookObj=new AddressBook();
				addBookObj=addBook.get(iter);
				tfArray[0].setText(addBookObj.getName());
				tfArray[1].setText(addBookObj.getAddress());
				tfArray[2].setText(addBookObj.getPhone());
				tfArray[3].setText(addBookObj.getEmail());
			}
			catch(Exception excep)
			{
				System.out.println(excep);
			}
		}
	}
	

}
