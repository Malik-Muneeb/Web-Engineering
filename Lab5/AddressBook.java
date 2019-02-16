import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddressBook extends JFrame implements ActionListener
{
	JLabel lblAddress=new JLabel("Address Book",SwingConstants.CENTER);
	JButton btn[]=new JButton[4];
	
	AddressBook()
	{
		init();
	}
	
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		btn[0]=new JButton("Add Contact");
		btn[1]=new JButton("Search Contact");
		btn[2]=new JButton("Delete Contact");
		btn[3]=new JButton("Modify Contact");
		
		lblAddress.setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(lblAddress);
		c.add(Box.createRigidArea(new Dimension(5,20)));
		
		for(int i=0; i<4; i++)
		{
			btn[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			c.add(btn[i]);
			c.add(Box.createRigidArea(new Dimension(5,20)));
			btn[i].addActionListener(this);
		}
		
		setSize(300, 300);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}	
	
	public void actionPerformed(ActionEvent e) 
	{
		for(int i = 0; i < 4; i++) 
		{
			if(e.getSource() == btn[i]) 
			{
			
				setVisible(false);
				AddContact addFrame=new AddContact(i);
				addFrame.setVisible(true);
			}
		}
	}
	
	public static void main(String args[])
	{
		AddressBook AddBook=new AddressBook();
	}

	
}
