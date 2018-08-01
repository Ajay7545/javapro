package ProjectJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class page1 extends JDialog implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField username;
	private JTextField name;
	private JTextField mobile;
	private JPasswordField password1;
	private JPasswordField password2;
	private JPasswordField password;
	private JButton login;
	private JButton cancel;
	int attempts=3;

	private JFrame frame;
	private JLabel label;
	private JButton reset;
	private JButton create;
	private JRadioButton m;
	private JRadioButton f;
	String uname;
	String pass;
	
	public page1()	
	{
	
		getContentPane().setFont(new Font("Book Antiqua", Font.ITALIC, 18));
		getContentPane().setBackground(Color.WHITE);
	
	label = new JLabel("");
	label.setForeground(Color.RED);
	label.setBounds(0, 76, 424, 20);
	getContentPane().add(label);
	
	
	
			
			
			
	JSeparator separator = new JSeparator();
	separator.setBackground(Color.BLACK);
	separator.setBounds(10, 101, 414, 7);
	getContentPane().add(separator);
	
	JLabel lblUsername = new JLabel("Username..");
	lblUsername.setEnabled(false);
	lblUsername.setBounds(10, 37, 68, 14);
	getContentPane().add(lblUsername);
	
	JLabel lblPassword = new JLabel("Password..");
	lblPassword.setEnabled(false);
	lblPassword.setBounds(10, 62, 68, 14);
	getContentPane().add(lblPassword);
	
	username = new JTextField();
	username.setBackground(Color.LIGHT_GRAY);
	username.setBounds(73, 34, 101, 20);
	getContentPane().add(username);
	username.setColumns(10);
	
	password = new JPasswordField();
	password.setBackground(Color.LIGHT_GRAY);
	password.setBounds(73, 56, 101, 20);
	getContentPane().add(password);
	
	
	login = new JButton("Login...");
	login.setToolTipText("Click to Sign in");
	login.setForeground(new Color(0, 0, 204));
	login.addActionListener(new ActionListener() 
	{		
		public void actionPerformed(ActionEvent e) 
		{
			String uname=username.getText();
			@SuppressWarnings("deprecation")
			String psd=password.getText();
			
			if(attempts > 0)
			{
				System.out.println("Attempts: " + attempts);
				
				if(uname.equals("name") && psd.equals("password"))
				{
					JOptionPane.showMessageDialog(frame ,"You are succesfully Logged in....");
					new ProgrammingHub();
//					ProgrammingHub ph=new ProgrammingHub();
//					ph.setVisible(true);
//					ph.setResizable(false);
				}
				else
				{
					attempts--;
					label.setText("Invalid Usename and Password " +attempts+ " attempt left");
				}
			}
			else
			{
				label.setText("Yous account is Blocked for 1 day");
			}
//			return;
		}
			
			
		
	});
	login.setBounds(324, 19, 89, 23);
	getContentPane().add(login);
	
	JCheckBox checkBox = new JCheckBox("Keep me logged in");
	checkBox.setToolTipText("Click to Stay Login");
	checkBox.setBounds(183, 56, 89, 20);
	getContentPane().add(checkBox);
	
	JLabel lblCreateAccountOnline = new JLabel("Create  New Account....");
	lblCreateAccountOnline.setFont(new Font("Times New Roman", Font.ITALIC, 25));
	lblCreateAccountOnline.setForeground(Color.GREEN);
	lblCreateAccountOnline.setBounds(10, 97, 347, 36);
	getContentPane().add(lblCreateAccountOnline);
	
	JLabel label_1 = new JLabel("Name");
	label_1.setForeground(Color.BLUE);
	label_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
	label_1.setBounds(10, 142, 42, 20);
	getContentPane().add(label_1);
	
	name = new JTextField();
	name.setBackground(Color.LIGHT_GRAY);
	name.setColumns(10);
	name.setBounds(112, 144, 183, 20);
	getContentPane().add(name);
	
	JLabel lblMoblieNo = new JLabel("Mobile No");
	lblMoblieNo.setForeground(Color.BLUE);
	lblMoblieNo.setFont(new Font("Times New Roman", Font.ITALIC, 18));
	lblMoblieNo.setBounds(10, 178, 86, 20);
	getContentPane().add(lblMoblieNo);
	
	mobile = new JTextField();
	mobile.setColumns(10);
	mobile.setBackground(Color.LIGHT_GRAY);
	mobile.setBounds(112, 180, 183, 20);
	getContentPane().add(mobile);
	
	create = new JButton("Create Account");
	create.setToolTipText("Click to Create Account");
	create.setForeground(Color.GREEN);
	create.setBackground(Color.LIGHT_GRAY);
	create.setBounds(55, 364, 120, 23);
	getContentPane().add(create);
	
	JLabel label_4 = new JLabel("Gender");
	label_4.setForeground(Color.BLUE);
	label_4.setFont(new Font("Times New Roman", Font.ITALIC, 18));
	label_4.setBounds(10, 224, 86, 20);
	getContentPane().add(label_4);
	
	m = new JRadioButton("Male");
	m.setBackground(Color.LIGHT_GRAY);
	m.setForeground(Color.BLUE);
	m.setBounds(112, 225, 81, 23);
	getContentPane().add(m);
	
	f = new JRadioButton("Female");
	f.setBackground(Color.LIGHT_GRAY);
	f.setForeground(Color.BLUE);
	f.setBounds(209, 225, 86, 23);
	getContentPane().add(f);
	
	JLabel label_3 = new JLabel("Password");
	label_3.setForeground(Color.BLUE);
	label_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
	label_3.setBounds(10, 275, 86, 20);
	getContentPane().add(label_3);
	
	JLabel label_2 = new JLabel("Re-Password");
	label_2.setForeground(Color.BLUE);
	label_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
	label_2.setBounds(10, 322, 101, 20);
	getContentPane().add(label_2);
	
	reset = new JButton("Reset");
	reset.setForeground(Color.RED);
	reset.setBackground(Color.LIGHT_GRAY);
	reset.setBounds(244, 364, 120, 23);
	getContentPane().add(reset);
	
	
	password1 = new JPasswordField();
	password1.setBackground(Color.LIGHT_GRAY);
	password1.setBounds(112, 277, 183, 20);
	getContentPane().add(password1);
	
	password2 = new JPasswordField();
	password2.setBackground(Color.LIGHT_GRAY);
	password2.setBounds(112, 324, 183, 20);
	getContentPane().add(password2);
	
	
	
	ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));
	getContentPane().setLayout(null);
	
	JLabel lblProgramminghub = new JLabel("ProgrammingHub");
	lblProgramminghub.setForeground(Color.WHITE);
	lblProgramminghub.setFont(new Font("Times New Roman", Font.ITALIC, 25));
	lblProgramminghub.setBounds(0, 1, 216, 36);
	getContentPane().add(lblProgramminghub);
	
	cancel = new JButton("Cancel");
	cancel.setToolTipText("Click to Exit");
	cancel.setForeground(new Color(255, 0, 0));
	cancel.setBounds(324, 53, 89, 23);
	getContentPane().add(cancel);
	JLabel label1 = new JLabel(ii);
	label1.setText("  b;lf");
	label1.setBounds(0, 0, 434,414);
	getContentPane().add(label1);


	login.addActionListener(this);
	cancel.addActionListener(this);
	create.addActionListener(this);
	reset.addActionListener(this);
	
	
	getRootPane().setDefaultButton(login);	
	
	setSize(450,450);
	
	
	
	setLocationRelativeTo(null);
	setVisible(true);
	
	

	}
	
	
	public static void main(String ar[])
	{
		new page1();
	}
	

	 public void actionPerformed(ActionEvent e)
	{
		 Object ob = e.getSource();
			 if(ob==cancel)
			{
				System.exit(0);
			}
			else if(ob == login)
			{
				String user = username.getText();
				String pass = new String(password.getPassword());
				String s= "select * from login";
				Connection con = mconnection.connect();
				try
				{
					PreparedStatement ps = con.prepareStatement(s);
					//ps.setString(1,user);
					//ps.setString(2,pass);
					ResultSet rs= ps.executeQuery();
					int cnt=0;
					while(rs.next())
					{
						String q = rs.getString("username");
						String w = rs.getString("password");
						if(q.equals(user) && w.equals(pass))
						{	
							++cnt;
							new ProgrammingHub();
							dispose();
							break;
						}
						
					}
					if(cnt==0)
					{
							password.setText("");
							username.setText("");
							JOptionPane.showMessageDialog(null,"Invalid");
							username.requestFocusInWindow();
					}
				}
				catch (SQLException se)
				{
					se.printStackTrace();
				}
			}
			  if(ob==create)
				{
					
					String gender="";
					if(m.isSelected())
						gender="Male";
					else
						gender="Female";
				
					String name1 = name.getText();
					String mobile1= mobile.getText();
					@SuppressWarnings("deprecation")
					String pass1 = password1.getText();
					@SuppressWarnings({ "unused", "deprecation" })
					String pass2 = password2.getText();
					String s= "insert into users(name,mobile,gender,password) values(?,?,?,?)";
					Connection con = mconnection.connect();
					try
					{
						PreparedStatement ps= con.prepareStatement(s);
						ps.setString(1,name1);
						ps.setString(2,mobile1);
						ps.setString(3, gender);
						ps.setString(4,pass1);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null,"Info Added");
						//dispose();
						
						
						String sm= "select * from login";
						username=name;
						password=password;
						
						
					}
					catch(SQLException se)
					{
						se.printStackTrace();
					}
				}


}

		
			
	
		void getId()
		{
			String s= "select * from users";
			Connection con= mconnection.connect();
			try
			{
				PreparedStatement ps= con.prepareStatement(s);
				ResultSet rs= ps.executeQuery();
				rs.next();
				uname=rs.getString(1);
				pass=rs.getString(4);
			}
			catch (SQLException se)
			{
				se.printStackTrace();
			}
			
		}
}