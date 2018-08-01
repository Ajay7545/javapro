package ProjectJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;


public class cpro extends JDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCProgramming;
	private JButton hp;
	private JButton cancel;
	private JTextArea txtrCProgrammingHistory_1;
	
	public cpro()
	{
	
		
		ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));

/*		ImageIcon iio= new ImageIcon(getClass().getResource("img/pro.jpg"));
		JLabel labela = new JLabel(iio);
		labela.setBounds(0, -6, 152,117);
		getContentPane().add(labela);*/
		
		
		getContentPane().setBackground(Color.BLACK);

		getContentPane().setLayout(null);
		
		lblCProgramming = new JLabel("C Programming");
		lblCProgramming.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lblCProgramming.setForeground(Color.WHITE);
		lblCProgramming.setBounds(87, 21, 268, 40);
		getContentPane().add(lblCProgramming);
		
		hp = new JButton("Back to HomePage");
		hp.setToolTipText("click for Home Page");
		hp.setBackground(new Color(0, 0, 255));
		hp.setForeground(new Color(240, 255, 240));
		hp.setBounds(148, 314, 162, 23);
		getContentPane().add(hp);
		
		cancel = new JButton("Exit");
		cancel.setForeground(new Color(192, 192, 192));
		cancel.setBackground(new Color(255, 0, 0));
		cancel.setBounds(335, 314, 89, 23);
		getContentPane().add(cancel);
		
		//txtrCProgrammingHistory_1 = new JTextArea();
		//txtrCProgrammingHistory_1.setText("Whereas, character is enclosed by single quotes in C\u2026more\u2026\r\nC \u2013 POINTER:\r\nC Pointer is a variable that stores/points the address of the other variable. C Pointer is used to allocate memory dynamically,  i.e. at run time. The variable might be any of the data types such as int, float, char, double, short etc. Normal variable stores the value, whereas pointer variable stores the address of the variable\u2026.more\u2026\r\nC \u2013 FUNCTIONS:\r\nFunctions in C programming are basic building blocks in a program. All C programs are written using functions to improve re-usability, understandability and to keep track of them. A large C program is divided into basic building blocks called C function. C function contains set of instructions enclosed by \u201C{  }\u201D which performs specific\u2026.more\u2026 \r\nC \u2013 LIBRARY FUNCTIONS:\r\nLibrary functions in C language are inbuilt functions which are grouped together and placed in a common place called a library. Each library function in C programming language performs a specific operation. We can make use of these library functions to get the pre-defined output instead of writing our own code to get those outputs\u2026.more\u2026 \r\nC \u2013 COMMAND LINE ARGUMENTS:\r\nmain() function of a C program accepts arguments from command line or from other shell scripts by following commands. They are 1. argc 2. argv[]. In real time application, it will happen to pass arguments to the main program itself.  These arguments are passed to the main () function while executing binary file from command line\u2026.more\u2026 \r\nC \u2013 VARIABLE LENGTH ARGUMENT:\r\nVariable length arguments in C programming are an advanced concept offered by C99 standard. In C89 standard, fixed arguments only can be passed to the functions. When a function gets the number of arguments that changes at run time, we can go for a variable length arguments. It is denoted as \u2026 (3 dots)\u2026.more\u2026 \r\nLIST OF INBUILT FUNCTIONS IN C PROGRAMMING:\r\n1. C \u2013 ARITHMETIC FUNCTIONS:\r\nInbuilt C programming functions which are used to perform mathematical operations in a program are called Arithmetic functions. Example program for abs(), floor(), round(), ceil(), sqrt(), exp(), log(), sin(), cos(), tan(), pow() and trunc() functions are\u2026.more\u2026 \r\n2. C \u2013 INT, CHAR VALIDATION FUNCTIONS:\r\nThere are many inbuilt functions in C language which are used to validate the data type of given variable and to convert upper to lower case and lower to upper case are given below with description\u2026.more\u2026 \r\n3. C \u2013 BUFFER MANIPULATION FUNCTION:\r\nBuffer manipulation functions in C programming work on the address of the memory block rather than the values inside the address. Example programs for memset(), memcpy(), memmove(), memcmp(), memicmp() and memchr() functions are\u2026.more\u2026 \r\n4. C \u2013 TIME RELATED FUNCTIONS:\r\nTime functions in C are used to interact with system time routine and formatted time outputs are displayed. Example programs for the time functions are\u2026.more\u2026 \r\n5. C \u2013 DYNAMIC MEMORY ALLOCATION:\r\nThe process of allocating memory during program execution is called dynamic memory allocation. C language offers 4 dynamic memory allocation functions. They are, malloc(), calloc(), realloc() and free()\u2026.more\u2026 \r\n6. C \u2013 TYPE CASTING FUNCTIONS:\r\nTypecasting concept in C language is used to modify a variable from one date type to another data type. New data type should be mentioned before the variable name or value in brackets which to be typecast\u2026.more\u2026 \r\n7. C \u2013 MISCELLANEOUS FUNCTIONS:\r\nDescriptions and example programs for C environment functions such as getenv(), setenv(), putenv() and other functions perror(), random() and delay() are\u2026.more\u2026 \r\nC \u2013 STRUCTURE:\r\nC Structure is a collection of different data types which are grouped together and each element in a C structure is called member. If you want to access structure members in C, structure variable should be declared\u2026.more\u2026 \r\nC \u2013 TYPEDEF:\r\nTypedef is a keyword that is used to give a new symbolic name for the existing name in a C program. This is same like defining alias for the commands\u2026.more\u2026 \r\nC \u2013 UNION:\r\nC Union is also like structure, i.e. collection of different data types which are grouped together. Each element in a union is called member. Union and structure in C  are same in concepts, except allocating memory for their members\u2026.more\u2026 \r\nC \u2013 PREPROCESSOR DIRECTIVES:\r\nBefore a C program is compiled in a compiler, source code is processed by a program called preprocessor. This process is called preprocessing.");
		
		
		JTextPane txtpnCProgrammingHistory = new JTextPane();
		
		txtpnCProgrammingHistory.setText("C PROGRAMMING HISTORY:\r\nThe C language is a structure oriented programming language, was developed at Bell Laboratories in 1972 by Dennis Ritchie. C language features were derived from an earlier language called \u201CB\u201D (Basic Combined Programming Language \u2013 BCPL). C language was invented for implementing UNIX operating system\u2026.more\u2026\r\nC PROGRAMMING BASICS:\r\nSteps to be followed for any C program to create and get the output are explained . This is common to all C programs and there is no exception, whether its a very small C program or very large program. Structure of a C program is defined by a set of rules called protocol, to be followed by programmer while writing a C program\u2026more\u2026\r\nC \u2013 PRINTF AND SCANF:\r\nprintf() and scanf() functions are inbuilt library functions in C which are available in the C library by default. These functions are declared and related macros are defined in \u201Cstdio.h\u201D which is a header file. We have to include \u201Cstdio.h\u201D file as shown in below C program to make use of these printf() and scanf() library functions\u2026.more\u2026\r\nC \u2013 DATA TYPES:\r\nC data types are defined as the data storage format that a variable can store a data to perform a specific operation. Data types are used to define a variable before using in a program. Size of variable, const and array are determined by data types. There are four data types in the C language. They are\u2026.more\u2026\r\nC \u2013 TOKENS AND KEYWORDS:\r\nC tokens, Identifiers and Keywords are the basics in a C program. All are explained in this page with definition and simple example programs. C tokens are the basic building blocks in C language which are constructed together to write a C program. Each program element in a C program is given a name called identifiers\u2026.more\u2026\r\nC \u2013 CONSTANTS:\r\nC Constants are also like normal variables. But, the only difference is, their values can\u2019t be modified by the program once they are defined. Constants refer to fixed values. They are also called as literals. Constants may be belonging to any of the data type\u2026.more\u2026\r\nC \u2013 VARIABLES:\r\nC variable is a named location in a memory where a program can manipulate the data. This location is used to hold the value of the variable. The value of the C variable may get changed in the program. The C variable might be belonging to any of the data types like int, float, char etc\u2026.more\u2026\r\nC \u2013 OPERATORS AND EXPRESSIONS:\r\nThe symbols which are used to perform logical and mathematical operations in a C program are called C operators. These C operators join individual constants and variables to form expressions. Operators, functions, constants and variables are combined together to form expressions\u2026.more\u2026\r\nC \u2013 DECISION CONTROL STATEMENTS:\r\nIn decision control statements (C \u2013 if else and nested if), group of statement is executed when the condition is true.  If the condition is false, then, else part statements are executed. In C programming, there are 3 types of decision making control statements in C language. They are\u2026.more\u2026\r\nC \u2013 LOOP CONTROL STATEMENTS:\r\nLoop control statements in C programming are used to perform looping operations until the given condition is true. Control comes out of the loop statements once the condition becomes false. There are 3 types of loop control statements in C language. They are\u2026.more\u2026\r\nC \u2013 CASE CONTROL STATEMENTS:\r\nThe statements which are used to execute only specific block of statements in a series of blocks are called case control statements. There are 4 types of case control statements in C programming. They are 1) switch 2) break 3) continue 4) goto\u2026.more\u2026\r\nC \u2013 TYPE QUALIFIERS:\r\nThe keywords which are used to modify the properties of a variable are called type qualifiers. There are two types of qualifiers available in C programming. They are 1) const 2) volatile. Constants are also like normal variables\u2026.more\u2026\r\nC \u2013 STORAGE CLASS SPECIFIERS:\r\nStorage class specifiers in C programming tell the compiler where to store a variable, how to store the variable, what is the initial value of the variable and the lifetime of the variable. There are 4 storage class specifiers available in C language. They are\u2026.more\u2026\r\nC \u2013 ARRAY:\r\nC Array is a collection of variables belongings to the same data type. You can store group of data of the same data type in an array. There are 2 types of arrays in C programming. They are 1) One dimensional array 2) Multidimensional array\u2026.more\u2026\r\nC \u2013 STRING:\r\nC Strings are nothing but array of characters ended with null character (\u2018\\0\u2019). This null character indicates the end of the string. In C programming, strings are always enclosed by double quotes. Whereas, character is enclosed by single quotes in C\u2026more\u2026\r\nC \u2013 POINTER:\r\nC Pointer is a variable that stores/points the address of the other variable. C Pointer is used to allocate memory dynamically,  i.e. at run time. The variable might be any of the data types such as int, float, char, double, short etc. Normal variable stores the value, whereas pointer variable stores the address of the variable\u2026.more\u2026\r\nC \u2013 FUNCTIONS:\r\nFunctions in C programming are basic building blocks in a program. All C programs are written using functions to improve re-usability, understandability and to keep track of them. A large C program is divided into basic building blocks called C function. C function contains set of instructions enclosed by \u201C{  }\u201D which performs specific\u2026.more\u2026 \r\nC \u2013 LIBRARY FUNCTIONS:\r\nLibrary functions in C language are inbuilt functions which are grouped together and placed in a common place called a library. Each library function in C programming language performs a specific operation. We can make use of these library functions to get the pre-defined output instead of writing our own code to get those outputs\u2026.more\u2026 \r\nC \u2013 COMMAND LINE ARGUMENTS:\r\nmain() function of a C program accepts arguments from command line or from other shell scripts by following commands. They are 1. argc 2. argv[]. In real time application, it will happen to pass arguments to the main program itself.  These arguments are passed to the main () function while executing binary file from command line\u2026.more\u2026 \r\nC \u2013 VARIABLE LENGTH ARGUMENT:\r\nVariable length arguments in C programming are an advanced concept offered by C99 standard. In C89 standard, fixed arguments only can be passed to the functions. When a function gets the number of arguments that changes at run time, we can go for a variable length arguments. It is denoted as \u2026 (3 dots)\u2026.more\u2026 \r\nLIST OF INBUILT FUNCTIONS IN C PROGRAMMING:\r\n1. C \u2013 ARITHMETIC FUNCTIONS:\r\nInbuilt C programming functions which are used to perform mathematical operations in a program are called Arithmetic functions. Example program for abs(), floor(), round(), ceil(), sqrt(), exp(), log(), sin(), cos(), tan(), pow() and trunc() functions are\u2026.more\u2026 \r\n2. C \u2013 INT, CHAR VALIDATION FUNCTIONS:\r\nThere are many inbuilt functions in C language which are used to validate the data type of given variable and to convert upper to lower case and lower to upper case are given below with description\u2026.more\u2026 \r\n3. C \u2013 BUFFER MANIPULATION FUNCTION:\r\nBuffer manipulation functions in C programming work on the address of the memory block rather than the values inside the address. Example programs for memset(), memcpy(), memmove(), memcmp(), memicmp() and memchr() functions are\u2026.more\u2026 \r\n4. C \u2013 TIME RELATED FUNCTIONS:\r\nTime functions in C are used to interact with system time routine and formatted time outputs are displayed. Example programs for the time functions are\u2026.more\u2026 \r\n5. C \u2013 DYNAMIC MEMORY ALLOCATION:\r\nThe process of allocating memory during program execution is called dynamic memory allocation. C language offers 4 dynamic memory allocation functions. They are, malloc(), calloc(), realloc() and free()\u2026.more\u2026 \r\n6. C \u2013 TYPE CASTING FUNCTIONS:\r\nTypecasting concept in C language is used to modify a variable from one date type to another data type. New data type should be mentioned before the variable name or value in brackets which to be typecast\u2026.more\u2026 \r\n7. C \u2013 MISCELLANEOUS FUNCTIONS:\r\nDescriptions and example programs for C environment functions such as getenv(), setenv(), putenv() and other functions perror(), random() and delay() are\u2026.more\u2026 \r\nC \u2013 STRUCTURE:\r\nC Structure is a collection of different data types which are grouped together and each element in a C structure is called member. If you want to access structure members in C, structure variable should be declared\u2026.more\u2026 \r\nC \u2013 TYPEDEF:\r\nTypedef is a keyword that is used to give a new symbolic name for the existing name in a C program. This is same like defining alias for the commands\u2026.more\u2026 \r\nC \u2013 UNION:\r\nC Union is also like structure, i.e. collection of different data types which are grouped together. Each element in a union is called member. Union and structure in C  are same in concepts, except allocating memory for their members\u2026.more\u2026 \r\nC \u2013 PREPROCESSOR DIRECTIVES:\r\nBefore a C program is compiled in a compiler, source code is processed by a program called preprocessor.");
		JScrollPane jsp=new JScrollPane(txtpnCProgrammingHistory,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(10, 50, 414,260);
		getContentPane().add(jsp);
		
		//txtpnCProgrammingHistory.setBounds(10, 63, 414, 240);
		//getContentPane().add(txtpnCProgrammingHistory);
		JLabel lblCProgrammingHistory = new JLabel(ii);
		lblCProgrammingHistory.setBounds(0, 0, 434,348);
		getContentPane().add(lblCProgrammingHistory);
		//JEditorPane(add);
		
		hp.addActionListener(this);
		cancel.addActionListener(this);
		setSize(450,384);		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new cpro();
	}
	
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
	
	}
}