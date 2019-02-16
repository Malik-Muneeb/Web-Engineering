import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AddContact extends JFrame implements ActionListener
{
	PrintWriter pr;
	BufferedReader br;
	JLabel lblHeader,lblName, lblNumber, lblShowNum;
	JTextField tfName, tfNumber;
	Container con;
	//JPanel panel;
	JButton btnConfirm, btnSearch, btnUpdate, btnDel;
	
	AddContact(int processNumber)
	{
		if(processNumber==0)
			add();
		else if(processNumber==1)
			search();
	}
	
	void add()
	{
		lblHeader=new JLabel("Add Contact");
		lblName= new JLabel("Name: ");
		lblNumber=new JLabel("Number: ");
		tfName=new JTextField(15);
		tfName.setToolTipText("Enter Name...");
		tfNumber=new JTextField(15);
		tfNumber.setToolTipText("Enter Number...");
		btnConfirm=new JButton("Add Contact");
		
		con=getContentPane();
		con.setLayout(new FlowLayout());
		
		lblHeader.setAlignmentX(Component.LEFT_ALIGNMENT);
		con.add(lblHeader);
		
		con.add(Box.createRigidArea(new Dimension(500,20)));
		lblName.setAlignmentX(Component.LEFT_ALIGNMENT);
		con.add(lblName);
		tfName.setMaximumSize( tfName.getPreferredSize() );
		con.add(tfName);
		
		con.add(Box.createRigidArea(new Dimension(250,20)));
		lblNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
		con.add(lblNumber);
		tfNumber.setMaximumSize( tfNumber.getPreferredSize() );
		con.add(tfNumber);
		
		con.add(Box.createRigidArea(new Dimension(250,25)));
		con.add(btnConfirm);
		
		btnConfirm.addActionListener(this);
		
		setSize(300, 300);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void search()
	{
		lblHeader=new JLabel("Search Contact");
		lblName= new JLabel("Name: ");
		tfName=new JTextField(15);
		btnSearch=new JButton("Search Contact");
		
		con=getContentPane();
		con.setLayout(new FlowLayout());
		
		lblHeader.setAlignmentX(Component.LEFT_ALIGNMENT);
		con.add(lblHeader);
		
		con.add(Box.createRigidArea(new Dimension(500,20)));
		lblName.setAlignmentX(Component.LEFT_ALIGNMENT);
		con.add(lblName);
		tfName.setMaximumSize( tfName.getPreferredSize() );
		con.add(tfName);
		
		con.add(Box.createRigidArea(new Dimension(250,25)));
		con.add(btnSearch);
		
		con.add(Box.createRigidArea(new Dimension(250,20)));
		
		lblShowNum=new JLabel();
		lblShowNum.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSearch.addActionListener(this);
		
		setSize(300, 300);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnConfirm)
		{
			try 
			{
				pr=new PrintWriter("Record.txt");
			} 
			catch (FileNotFoundException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			pr.write(tfName.getText()+" "+tfNumber.getText());
			pr.close();
			AddressBook addFrame=new AddressBook();
			addFrame.setVisible(true);
			
		}
		else if(e.getSource()==btnSearch)
		{
			FileReader fr = null;
			try 
			{
				fr = new FileReader(new File("Record.txt"));
			} 
			catch (FileNotFoundException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			br =new BufferedReader(fr);
			int i;
			String str = null;
			boolean isFound=false;
			try {
				str="";
				while((i=br.read())!=-1)
				{
					if(i!=32)
						str=str+(char)i;
					else
					{
						if(str.equals(tfName.getText()))
						{
							
							String num = null;
							num="";
							int j=br.read();
							while(j!=32 && j!=-1)
							{
								num=num+(char)j;
								j=br.read();
							}
							JOptionPane.showMessageDialog(null, str+" has this number "+num, "InfoBox: " + "Found Your Record", JOptionPane.INFORMATION_MESSAGE);
							isFound=true;
							str=null;
						}
					}
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String notFoundMsg="I dont have record of "+tfName.getText();
			if(!isFound)
				JOptionPane.showMessageDialog(null, notFoundMsg, "InfoBox: " + "Found Your Record", JOptionPane.INFORMATION_MESSAGE);
			AddressBook addFrame=new AddressBook();
			addFrame.setVisible(true);
		}
		
		
		
	}
	
}
