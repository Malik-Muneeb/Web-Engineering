import java.awt.*;
import javax.swing.*;

public class AddressBookGUI extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1605694419905316879L;
	String lblName[]= {"Name","Address","Phone","Email"};
	JLabel lblArray[]=new JLabel[4];
	JTextField tfArray[]=new JTextField[4];
	String tfName[]= {"tfName","tfAddress","tfPhone", "tfEmail"};
	String btnName[]= {"Save", "Delete", "Update","<<","Search",">>"};
	JButton btnArray[]=new JButton[6];
	Container contain;
	Listener listener;
	
	public AddressBookGUI()
	{
		init();
	}
	
	void init()
	{
		JPanel lblPanel, tfPanel, btnPanel;
		lblPanel=new JPanel(new GridLayout(4,1));
		tfPanel=new JPanel(new GridLayout(4,1,30,30));
		for(int i=0; i<4; i++)
		{
			//label settings
			lblArray[i]=new JLabel();
			lblArray[i].setText(lblName[i]);
			lblPanel.add(lblArray[i]);
			
			//textField settings
			tfArray[i]=new JTextField();
			tfArray[i].setName(tfName[i]);
			tfPanel.add(tfArray[i]);
		}
		
		btnPanel=new JPanel(new GridLayout(2,3));
		for(int i=0; i<6; i++)
		{
			btnArray[i]=new JButton();
			btnArray[i].setName(btnName[i]);
			btnPanel.add(btnArray[i]);
			btnArray[i].setText(btnName[i]);
		}
		
		listener=new Listener(btnArray,tfArray);
		for(int i=0; i<6; i++)
			btnArray[i].addActionListener(listener);
		
		contain=getContentPane();
		setLayout(new BorderLayout());
		contain.add(lblPanel, BorderLayout.WEST);
		contain.add(tfPanel,BorderLayout.CENTER);
		//contain.add((Box.createRigidArea(new Dimension(5,40))), BorderLayout.NORTH);
		contain.add(btnPanel,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}

	public static void main(String args[])
	{
		AddressBookGUI frame=new AddressBookGUI();
	}

}
