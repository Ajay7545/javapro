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

public class python extends JDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton hp;
	private JButton cancel;

	public python() 
	{
		
		ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));
		
		setSize(521,448);
		getContentPane().setLayout(null);
		
		JLabel lblPython = new JLabel("Python");
		lblPython.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 37));
		lblPython.setForeground(new Color(153, 50, 204));
		lblPython.setBounds(179, 11, 160, 48);
		getContentPane().add(lblPython);
		
		JTextArea txtrWhatIsPython = new JTextArea();
		txtrWhatIsPython.setText("WHAT IS PYTHON?\r\nThe Python programming language is freely available and makes solving a computer problem almost as easy as writing out your thoughts about the solution. The code can be written once and run on almost any computer without needing to change the program. \r\n\r\n\r\nHOW PYTHON IS USED\r\nPython is a general purpose programming language that can be used on any modern computer operating system. It can be used for processing text, numbers, images, scientific data and just about anything else you might save on a computer. It is used daily in the operations of the Google search engine, the video-sharing website YouTube, NASA and the New York Stock Exchange. These are but a few of the places where Python plays important roles in the success of business, government and non-profit organizations; there are many others.\r\nPython is an interpreted language. This means that it is not converted to computer-readable code before the program is run but at runtime. In the past, this type of language was called a scripting language, intimating its use was for for trivial tasks. However, programming languages such as Python have forced a change in that nomenclature. Increasingly, large applications are written almost exclusively in Python. Some ways that you can apply Python include:\r\n\u2022\tProgramming CGI for Web Applications\r\n\u2022\tBuilding an RSS Reader\r\n\u2022\tReading from and Writing to MySQL\r\n\u2022\tReading from and Writing to PostgreSQL\r\n\u2022\tCreating Calendars in HTML\r\n\u2022\tWorking With Files\r\n\r\nHOW DOES PYTHON COMPARE TO PERL?\r\nPython is an excellent language for large or complex programming projects. Integral to programming in any language is making the code easy for the next programmer to read and maintain. It takes great effort to keep Perl and PHP programs readable. Where Perl gets unruly after 20 or 30 lines, Python remains neat and readable, making even the largest projects easy to manage.\r\nWith its readability, ease of acquisition and extensibility, Python offers much faster application development. In addition to easy syntax and substantial processing abilities, Python is sometimes said to come with \"batteries included\" because of its extensive library, a repository of pre-written code that works out of the box.\r\n\r\nHOW DOES PYTHON COMPARE TO PHP?\r\nThe commands and syntax of Python differ from other interpreted languages. PHP is increasingly displacing Perl as the lingua franca of web development. However, more than either PHP or Perl, Python is much easier to read and to follow.\r\nAt least one downside which PHP shares with Perl is its squirrely code. Because of the syntax of PHP and Perl, it is much harder to code programs that exceed 50 or 100 lines. Python, on the other hand, has readability hard wired into the fabric of the language. The readability of Python makes programs easier to maintain and extend.\r\nWhile it is starting to see more general usage, PHP is at heart a web-oriented programming language designed to output web-readable information, not handle system-level tasks. This difference is exemplified in the fact that you can develop a web server in Python that understands PHP, but you cannot develop a web server in PHP that understands Python.\r\nFinally, Python is object-oriented. PHP is not. This has significant implications for the readability, ease of maintainance, and scalability of the programs.\r\nHOW DOES PYTHON COMPARE TO RUBY?\r\nPython is frequently compared to Ruby. Both are interpreted and therefore high level. Their code is implemented in such a way that you need not understand all the details. They are simply taken care of.\r\nBoth are object-oriented from the ground up. Their implementation of classes and objects allow for greater re-use of code and ease of maintainability.\r\nBoth are general purpose. They can be used for the simplest of tasks like converting text or for much more complicated matters such as controlling robots and managing major financial data systems.\r\nThere are two major differences between the two languages: readability and flexibility. Due to its object-oriented nature, Ruby code does not err on the side of being squirrely like Perl or PHP. Instead, it errs in being so obtuse that it is often unreadable; it tends to presume upon the programmer's intentions. One of the chief questions asked by students learning Ruby is \"How does it know to do that?\" With Python, this information is typically plain in the syntax. Aside from enforcing indentation for readability, Python also enforces transparency of information by not assuming too much.\r\nBecause it does not assume, Python allows for easy variation from the standard way of doing things when needed while insisting that such variation is explicit in the code. This gives power to the programmer to do whatever is necessary while ensuring that those who read the code later can make sense of it. After programmers use Python for a few tasks, they often find it hard to use anything else.\r\nHOW DOES PYTHON COMPARE TO JAVA?\r\nBoth Python and Java are object-oriented languages with substantial libraries of pre-written code that can be run on almost any operating system. However, their implementations are vastly different.\r\nJava is neither an interpreted language nor a compiled language. It is a bit of both. When compiled, Java programs are compiled to bytecode\u2014a Java-specific type of code. When the program is run, this bytecode is run through a Java Runtime Environment to convert it to machine code, which is readable and executable by the computer. Once compiled to bytecode, Java programs cannot be modified.\r\nPython programs, on the other hand, are typically compiled at the time of running, when the Python interpreter reads the program. However, they can be compiled to computer-readable machine code. Python does not use an intermediary step for platform independence. Instead, platform independence is in the implementation of the interpreter.\r\n");
		JScrollPane jsp = new JScrollPane(txtrWhatIsPython, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(20, 57, 446, 300);
		add(jsp);
//		txtrWhatIsPython.setBounds(20, 57, 446, 300);
//		getContentPane().add(txtrWhatIsPython);
		
		hp = new JButton("Back to HomePage");
		hp.setToolTipText("Click for Homepage");
		hp.setBackground(new Color(221, 160, 221));
		hp.setForeground(Color.BLUE);
		hp.setBounds(168, 378, 143, 23);
		getContentPane().add(hp);
		
		cancel = new JButton("Exit");
		cancel.setBackground(new Color(255, 69, 0));
		cancel.setForeground(new Color(176, 224, 230));
		cancel.setBounds(377, 378, 89, 23);
		getContentPane().add(cancel);
		JLabel label = new JLabel(ii);
		label.setForeground(new Color(0, 0, 255));
		label.setBounds(0, 0, 505,412);
		getContentPane().add(label);
		
		hp.addActionListener(this);
		cancel.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new python();
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
