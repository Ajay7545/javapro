package ProjectJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ProgrammingHub extends JDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton c;
	private JButton cpp;
	private JButton html;
	private JButton java;
	private JButton javascript;
	private JButton python;
	public ProgrammingHub()
	{
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		

		ImageIcon iio= new ImageIcon(getClass().getResource("img/pro.jpg"));
		JLabel labela = new JLabel(iio);
		labela.setToolTipText("For more detail contact www.programminghub.com");
		labela.setBounds(10, 5, 152,117);
		getContentPane().add(labela);
		
		
		ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));
		
		JLabel lblSelectLanguage = new JLabel("Select Language...");
		lblSelectLanguage.setFont(new Font("Sylfaen", Font.ITALIC, 20));
		lblSelectLanguage.setForeground(Color.RED);
		lblSelectLanguage.setBounds(148, 119, 184, 33);
		getContentPane().add(lblSelectLanguage);
		
		c = new JButton("C");
		c.setToolTipText("Click to Study C in Detail");
		c.setForeground(Color.DARK_GRAY);
		c.setBackground(Color.BLACK);
		c.setBounds(58, 180, 94, 33);
		getContentPane().add(c);
		
		cpp = new JButton("C#");
		cpp.setToolTipText("Click to Study C++ in Detail");
		cpp.setForeground(Color.DARK_GRAY);
		cpp.setBackground(Color.BLACK);
		cpp.setBounds(58, 241, 94, 33);
		getContentPane().add(cpp);
		
		html = new JButton("HTML");
		html.setToolTipText("Click to Study HTML in Detail");
		html.setForeground(Color.DARK_GRAY);
		html.setBackground(Color.BLACK);
		html.setBounds(58, 309, 94, 33);
		getContentPane().add(html);
		
		java = new JButton("JAVA");
		java.setToolTipText("Click to Study JAVA in Detail");
		java.setForeground(Color.DARK_GRAY);
		java.setBackground(Color.BLACK);
		java.setBounds(330, 180, 94, 33);
		getContentPane().add(java);
		
		javascript = new JButton("JAVASCRIPT");
		javascript.setToolTipText("Click to Study JAVASCRIPT in Detail");
		javascript.setForeground(Color.DARK_GRAY);
		javascript.setBackground(Color.BLACK);
		javascript.setBounds(330, 246, 94, 33);
		getContentPane().add(javascript);
		
		python = new JButton("PYTHON");
		python.setToolTipText("Click to Study PYTHON in Detail");
		python.setForeground(Color.DARK_GRAY);
		python.setBackground(Color.BLACK);
		python.setBounds(330, 309, 94, 33);
		getContentPane().add(python);
		
		JLabel label_1 = new JLabel("Programming Hub");
		label_1.setToolTipText("For Study in Detail go www.programminghub.com");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Sitka Display", Font.PLAIN, 38));
		label_1.setBounds(176, 53, 335, 58);
		getContentPane().add(label_1);
		
		JLabel label = new JLabel(ii);
		label.setToolTipText("Created By Ajay to Anupam Sir");
		label.setBounds(0, 0, 787,364);
		getContentPane().add(label);
		
		c.addActionListener(this);
		cpp.addActionListener(this);
		html.addActionListener(this);
		java.addActionListener(this);
		javascript.addActionListener(this);
		python.addActionListener(this);
		setLocationRelativeTo(null);
		

		setSize(800,400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new ProgrammingHub();
	}
	
	public void actionPerformed(ActionEvent e) 
	{

		Object ob=e.getSource();
		
		if(ob==c)
		{
			new cpro();
			dispose();
		}
		else if(ob==cpp)
		{
			new cpp();
			dispose();
		}
		else if(ob==html)
		{
			new html();
			dispose();
		}
		else if(ob==java)
		{
			new javaz();
			dispose();
		}
		else if(ob==javascript)
		{
			new javascript();
			dispose();
		}
		else if(ob==python)
		{
			new python();
			dispose();
		}
		
	}
}
