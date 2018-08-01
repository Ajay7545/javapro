package ProjectJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;

public class javascript extends JDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton hp;
	private JButton cancel;

	public javascript()
	{
		ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));
		
		setSize(508,450);
		getContentPane().setLayout(null);
		
		JLabel lblJavaScript = new JLabel("Java Script");
		lblJavaScript.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblJavaScript.setForeground(new Color(173, 255, 47));
		lblJavaScript.setBounds(146, 9, 228, 31);
		getContentPane().add(lblJavaScript);
		
		JTextArea txtrAllAllOperator = new JTextArea();
		txtrAllAllOperator.setLineWrap(true);
		txtrAllAllOperator.setText("ALL\r\nALL operator is used to select all tuples of SELECT STATEMENT. It is also used to compare a value to every value in another value set or result from a subquery.\r\n\uF0A7\tThe ALL operator returns TRUE iff all of the subqueries values meet the condition. The ALL must be preceded by comparison operators and evaluates true if all of the subqueries values meet the condition.\r\n\uF0A7\tALL is used with SELECT, WHERE, HAVING statement.\r\nALL with SELECT Statement:\r\nSyntax:\r\nSELECT ALL field_name\r\nFROM table_name\r\nWHERE condition(s);\r\nALL with WHERE or HAVING Statement:\r\nSyntax:\r\nSELECT column_name(s)\r\nFROM table_name\r\nWHERE column_name comparison_operator ALL\r\n(SELECT column_name\r\nFROM table_name\r\nWHERE condition(s));\r\nExample:\r\nConsider the following Products Table and OrderDetails Table,\r\nProducts Table\r\n \r\nOrderDetails Table\r\n \r\nQueries\r\n\uF0A7\tFind the name of the all the product.\r\n\uF0A7\tSELECT ALL ProductName \r\n\uF0A7\tFROM Products\r\n\uF0A7\tWHERE TRUE;\r\nOutput:\r\n \r\n\uF0A7\tFind the name of the product if all the records in the OrderDetails has Quantity either equal to 6 or 2.\r\n\uF0A7\tSELECT ProductName \r\n\uF0A7\tFROM Products\r\n\uF0A7\tWHERE ProductID = ALL (SELECT ProductId\r\n\uF0A7\t                       FROM OrderDetails\r\n\uF0A7\t                       WHERE Quantity = 6 OR Quantity = 2);\r\nOutput:\r\n \r\n\uF0A7\tFind the OrderID whose maximum Quantity among all product of that OrderID is greater than average quantity of all OrderID.\r\n\uF0A7\tSELECT OrderID \r\n\uF0A7\tFROM OrderDetails \r\n\uF0A7\tGROUP BY OrderID \r\n\uF0A7\tHAVING max(Quantity) > ALL (SELECT avg(Quantity) \r\n\uF0A7\t                            FROM OrderDetails \r\n\uF0A7\t                            GROUP BY OrderID);\r\nOutput:\r\n \r\nANY\r\nANY compares a value to each value in a list or results from a query and evaluates to true if the result of an inner query contains at least one row.\r\n\uF0A7\tANY return true if any of the subqueries values meet the condition.\r\n\uF0A7\tANY must be preceded by comparison operators.\r\nSyntax:\r\nSELECT column_name(s)\r\nFROM table_name\r\nWHERE column_name comparison_operator ANY\r\n(SELECT column_name\r\nFROM table_name\r\nWHERE condition(s));\r\nQueries\r\n\uF0A7\tFind the Distinct CategoryID of the products which have any record in OrderDetails Table.\r\n\uF0A7\tSELECT DISTINCT CategoryID\r\n\uF0A7\tFROM Products \r\n\uF0A7\tWHERE ProductID = ANY (SELECT ProductID \r\n\uF0A7\t                       FROM OrderDetails);\r\nOutput:\r\n \r\n\uF0A7\tFinds any records in the OrderDetails table that Quantity = 9.\r\n\uF0A7\tSELECT ProductName\r\n\uF0A7\tFROM Products\r\n\uF0A7\tWHERE ProductID = ANY (SELECT ProductID\r\n\uF0A7\t                       FROM OrderDetails\r\n\uF0A7\t                       WHERE Quantity = 9);\r\n \r\nThis article is contributed by Anuj Chauhan. If you like GeeksforGeeks and would like to contribute, you can also write an article using contribute.geeksforgeeks.org or mail your article to contribute@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks.\r\n\r\n");
		JScrollPane jsp=new JScrollPane(txtrAllAllOperator,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(20, 57, 446, 300);
		getContentPane().add(jsp);
		//txtrAllAllOperator.setBounds(23, 51, 405, 318);
		//getContentPane().add(txtrAllAllOperator);
		
		hp = new JButton("Back to HomePage");
		hp.setToolTipText("Click for Home Page");
		hp.setBackground(new Color(0, 255, 0));
		hp.setBounds(111, 380, 139, 23);
		getContentPane().add(hp);
		
		cancel = new JButton("Exit");
		cancel.setToolTipText("Click for Cancel");
		cancel.setBackground(new Color(255, 0, 0));
		cancel.setForeground(new Color(192, 192, 192));
		cancel.setBounds(325, 380, 89, 23);
		getContentPane().add(cancel);
		JLabel label = new JLabel(ii);
		label.setBounds(0, 0, 492,414);
		getContentPane().add(label);
		
		hp.addActionListener(this);
		cancel.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{
		new javascript();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
Object ob=e.getSource();
		
		if(ob==hp)
		{
			new ProgrammingHub();
			dispose();
		}
		else if(ob==cancel)
		{
			System.exit(0);
		}
	
		// TODO Auto-generated method stub
		
	}

}
