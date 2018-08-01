package ProjectJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class cpp extends JDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton cancel;
	private JButton hp;
	JScrollPane jsp;
	public cpp() 
	{
		
		
		ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));
		
		setSize(479,450);
		getContentPane().setLayout(null);
		
		JLabel lblCProgramming = new JLabel("C++ Programming");
		lblCProgramming.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 35));
		lblCProgramming.setForeground(new Color(255, 0, 0));
		lblCProgramming.setBounds(72, 11, 360, 39);
		getContentPane().add(lblCProgramming);
		
		JTextArea txtrCIsA = new JTextArea();
		txtrCIsA.setText("C++ is a statically typed, compiled, general-purpose, case-sensitive, free-form programming language that supports procedural, object-oriented, and generic programming.\r\nC++ is regarded as a middle-level language, as it comprises a combination of both high-level and low-level language features.\r\nC++ was developed by Bjarne Stroustrup starting in 1979 at Bell Labs in Murray Hill, New Jersey, as an enhancement to the C language and originally named C with Classes but later it was renamed C++ in 1983.\r\nC++ is a superset of C, and that virtually any legal C program is a legal C++ program.\r\nNote: A programming language is said to use static typing when type checking is performed during compile-time as opposed to run-time.\r\nObject-Oriented Programming\r\nC++ fully supports object-oriented programming, including the four pillars of object-oriented development:\r\n\u2022\tEncapsulation\r\n\u2022\tData hiding\r\n\u2022\tInheritance\r\n\u2022\tPolymorphism\r\nStandard Libraries\r\nStandard C++ consists of three important parts:\r\n\u2022\tThe core language giving all the building blocks including variables, data types and literals, etc.\r\n\u2022\tThe C++ Standard Library giving a rich set of functions manipulating files, strings, etc.\r\n\u2022\tThe Standard Template Library (STL) giving a rich set of methods manipulating data structures, etc.\r\nThe ANSI Standard\r\nThe ANSI standard is an attempt to ensure that C++ is portable -- that code you write for Microsoft's compiler will compile without errors, using a compiler on a Mac, UNIX, a Windows box, or an Alpha.\r\nThe ANSI standard has been stable for a while, and all the major C++ compiler manufacturers support the ANSI standard.\r\nLearning C++\r\nThe most important thing to do when learning C++ is to focus on concepts and not get lost in language technical details.\r\nThe purpose of learning a programming language is to become a better programmer; that is, to become more effective at designing and implementing new systems and at maintaining old ones.\r\nC++ supports a variety of programming styles. You can write in the style of Fortran, C, Smalltalk, etc., in any language. Each style can achieve its aims effectively while maintaining runtime and space efficiency.\r\nUse of C++\r\nC++ is used by hundreds of thousands of programmers in essentially every application domain.\r\nC++ is being highly used to write device drivers and other softwares that rely on direct manipulation of hardware under realtime constraints.\r\nC++ is widely used for teaching and research because it is clean enough for successful teaching of basic concepts.\r\nAnyone who has used either an Apple Macintosh or a PC running Windows has indirectly used C++ because the primary user interfaces of these systems are written in C++.\r\nGetting Set Up - C++ Compilers\r\nThe very first thing you need to do, before starting out in C++, is to make sure that you have a compiler. What is a compiler, you ask? A compiler turns the program that you write into an executable that your computer can actually understand and run. If you're taking a course, you probably have one provided through your school. If you're starting out on your own, your best bet is to use Code::Blocks with MinGW. If you're on Linux, you can use g++, and if you're on Mac OS X, you can use XCode. (If you are stuck using an older compiler, such as Turbo C++, you'll need to read this page on compatibility issues.) If you haven't yet done so, go ahead and get a compiler set up--you'll need it for the rest of the tutorial.\r\nIntro to the C++ Language\r\nA C++ program is a collection of commands, which tell the computer to do \"something\". This collection of commands is usually called C++ source code, source code or just code. Commands are either \"functions\" or \"keywords\". Keywords are a basic building block of the language, while functions are, in fact, usually written in terms of simpler functions--you'll see this in our very first program, below. (Confused? Think of it a bit like an outline for a book; the outline might show every chapter in the book; each chapter might have its own outline, composed of sections. Each section might have its own outline, or it might have all of the details written up.) Thankfully, C++ provides a great many common functions and keywords that you can use. \r\n\r\nBut how does a program actually start? Every program in C++ has one function, always named main, that is always called when your program first executes. From main, you can also call other functions whether they are written by us or, as mentioned earlier, provided by the compiler. \r\n\r\nSo how do you get access to those prewritten functions? To access those standard functions that comes with the compiler, you include a header with the #include directive. What this does is effectively take everything in the header and paste it into your program. Let's look at a working program:\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\t#include <iostream>\r\n \r\nusing namespace std;\r\n \r\nint main()\r\n{\r\n  cout<<\"HEY, you, I'm alive! Oh, and Hello World!\\n\";\r\n  cin.get();\r\n}\r\nLet's look at the elements of the program. The #include is a \"preprocessor\" directive that tells the compiler to put code from the header called iostream into our program before actually creating the executable. By including header files, you gain access to many different functions. For example, the cout function requires iostream. Following the include is the statement, \"using namespace std;\". This line tells the compiler to use a group of functions that are part of the standard library (std). By including this line at the top of a file, you allow the program to use functions such as cout. The semicolon is part of the syntax of C++. It tells the compiler that you're at the end of a command. You will see later that the semicolon is used to end most commands in C++. \r\n\r\nThe next important line is int main(). This line tells the compiler that there is a function named main, and that the function returns an integer, hence int. The \"curly braces\" ({ and }) signal the beginning and end of functions and other code blocks. You can think of them as meaning BEGIN and END. \r\n\r\nThe next line of the program may seem strange. If you have programmed in another language, you might expect that print would be the function used to display text. In C++, however, the cout object is used to display text (pronounced \"C out\"). It uses the << symbols, known as \"insertion operators\", to indicate what to output. cout<< results in a function call with the ensuing text as an argument to the function. The quotes tell the compiler that you want to output the literal string as-is. The '\\n' sequence is actually treated as a single character that stands for a newline (we'll talk about this later in more detail). It moves the cursor on your screen to the next line. Again, notice the semicolon: it is added onto the end of most lines, such as function calls, in C++. \r\n\r\nThe next command is cin.get(). This is another function call: it reads in input and expects the user to hit the return key. Many compiler environments will open a new console window, run the program, and then close the window. This command keeps that window from closing because the program is not done yet because it waits for you to hit enter. Including that line gives you time to see the program run. \r\n\r\nUpon reaching the end of main, the closing brace, our program will return the value of 0 (and integer, hence why we told main to return an int) to the operating system. This return value is important as it can be used to tell the OS whether our program succeeded or not. A return value of 0 means success and is returned automatically (but only for main, other functions require you to manually return a value), but if we wanted to return something else, such as 1, we would have to do it with a return statement:\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n11\t#include <iostream>\r\n \r\nusing namespace std;\r\n \r\nint main()\r\n{\r\n  cout<<\"HEY, you, I'm alive! Oh, and Hello World!\\n\";\r\n  cin.get();\r\n \r\n  return 1;\r\n}\r\nThe final brace closes off the function. You should try compiling this program and running it. You can cut and paste the code into a file, save it as a .cpp file. Our Code::Blocks tutorial actually takes you through creating a simple program, so check it out if you're confused. \r\n\r\nIf you are not using Code::Blocks, you should read the compiler instructions for information on how to compile. \r\nOnce you've got your first program running, why don't you try playing around with the cout function to get used to writing C++?\r\n\r\n\r\nAn Aside on Commenting Your Programs\r\nAs you are learning to program, you should also start to learn how to explain your programs (for yourself, if no one else). You do this by adding comments to code; I'll use them frequently to help explain code examples. \r\n\r\nWhen you tell the compiler a section of text is a comment, it will ignore it when running the code, allowing you to use any text you want to describe the real code. To create a comment use either //, which tells the compiler that the rest of the line is a comment, or /* and then */ to block off everything between as a comment. Certain compiler environments will change the color of a commented area, but some will not. Be certain not to accidentally comment out code (that is, to tell the compiler part of your code is a comment) you need for the program. When you are learning to program, it is useful to be able to comment out sections of code in order to see how the output is affected. \r\n\r\n\r\nUser interaction and Saving Information with Variables\r\nSo far you've learned how to write a simple program to display information typed in by you, the programmer, and how to describe your program with comments. That's great, but what about interacting with your user? Fortunately, it is also possible for your program to accept input. The function you use is known as cin, and is followed by the extraction operator >>. \r\n\r\nOf course, before you try to receive input, you must have a place to store that input. In programming, input and data are stored in variables. There are several different types of variables which store different kinds of information (e.g. numbers versus letters); when you tell the compiler you are declaring a variable, you must include the data type along with the name of the variable. Several basic types include char, int, and float. \r\n\r\nA variable of type char stores a single character, variables of type int store integers (numbers without decimal places), and variables of type float store numbers with decimal places. Each of these variable types - char, int, and float - is each a keyword that you use when you declare a variable.\r\nWhat's with all these variable types?\r\nSometimes it can be confusing to have multiple variable types when it seems like some variable types are redundant (why have integer numbers when you have floats?). Using the right variable type can be important for making your code readable and for efficiency--some variables require more memory than others. Moreover, because of the way the numbers are actually stored in memory, a float is \"inexact\", and should not be used when you need to store an \"exact\" integer value. \r\n\r\n\r\nDeclaring Variables in C++\r\nTo declare a variable you use the syntax \"type <name>;\". Here are some variable declaration examples:\r\n1\r\n2\r\n3\tint x;\r\nchar letter;\r\nfloat the_float;\r\nIt is permissible to declare multiple variables of the same type on the same line; each one should be separated by a comma.\r\n1\tint a, b, c, d;\r\nIf you were watching closely, you might have seen that declaration of a variable is always followed by a semicolon (note that this is the same procedure used when you call a function).\r\nCommon Errors when Declaring Variables in C++\r\nIf you attempt to use a variable that you have not declared, your program will not be compiled or run, and you will receive an error message informing you that you have made a mistake. Usually, this is called an undeclared variable.\r\nCase Sensitivity\r\nNow is a good time to talk about an important concept that can easily throw you off: case sensitivity. Basically, in C++, whether you use uppercase or lowercase letters matters. The words Cat and cat mean different things to the compiler. In C++, all language keywords, all functions and all variables are case sensitive. A difference in case between your variable declaration and the use of the variable is one reason you might get an undeclared variable error.\r\nUsing Variables\r\nOk, so you now know how to tell the compiler about variables, but what about using them? \r\n\r\nHere is a sample program demonstrating the use of a variable:\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n11\r\n12\r\n13\r\n14\t#include <iostream>\r\n \r\nusing namespace std;\r\n \r\nint main()\r\n{\r\n  int thisisanumber;\r\n \r\n  cout<<\"Please enter a number: \";\r\n  cin>> thisisanumber;\r\n  cin.ignore();\r\n  cout<<\"You entered: \"<< thisisanumber <<\"\\n\";\r\n  cin.get();\r\n}\r\nLet's break apart this program and examine it line by line. The keyword int declares thisisanumber to be an integer. The function cin>> reads a value into thisisanumber; the user must press enter before the number is read by the program. cin.ignore() is another function that reads and discards a character. Remember that when you type input into a program, it takes the enter key too. We don't need this, so we throw it away. Keep in mind that the variable was declared an integer; if the user attempts to type in a decimal number, it will be truncated (that is, the decimal component of the number will be ignored). Try typing in a sequence of characters or a decimal number when you run the example program; the response will vary from input to input, but in no case is it particularly pretty. Notice that when printing out a variable quotation marks are not used. Were there quotation marks, the output would be \"You Entered: thisisanumber.\" The lack of quotation marks informs the compiler that there is a variable, and therefore that the program should check the value of the variable in order to replace the variable name with the variable when executing the output function. Do not be confused by the inclusion of two separate insertion operators on one line. Including multiple insertion operators on one line is perfectly acceptable and all of the output will go to the same place. In fact, you must separate string literals (strings enclosed in quotation marks) and variables by giving each its own insertion operators (<<). Trying to put two variables together with only one << will give you an error message, do not try it. Do not forget to end functions and declarations with a semicolon. If you forget the semicolon, the compiler will give you an error message when you attempt to compile the program.\r\nChanging and Comparing Variables\r\nOf course, no matter what type you use, variables are uninteresting without the ability to modify them. Several operators used with variables include the following: *, -, +, /, =, ==, >, <. The * multiplies, the - subtracts, and the + adds. It is of course important to realize that to modify the value of a variable inside the program it is rather important to use the equal sign. In some languages, the equal sign compares the value of the left and right values, but in C++ == is used for that task. The equal sign is still extremely useful. It sets the left input to the equal sign, which must be one, and only one, variable equal to the value on the right side of the equal sign. The operators that perform mathematical functions should be used on the right side of an equal sign in order to assign the result to a variable on the left side. \r\n\r\nHere are a few examples:\r\n1\r\n2\r\n3\ta = 4 * 6; // (Note use of comments and of semicolon) a is 24\r\na = a + 5; // a equals the original value of a with five added to it\r\na == 5     // Does NOT assign five to a. Rather, it checks to see if a equals 5.\r\nThe other form of equal, ==, is not a way to assign a value to a variable. Rather, it checks to see if the variables are equal. It is useful in other areas of C++; for example, you will often use == in such constructions as conditional statements and loops. You can probably guess how < and > function. They are greater than and less than operators. \r\n\r\nFor example:\r\n1\r\n2\r\n3\ta < 5  // Checks to see if a is less than five\r\na > 5  // Checks to see if a is greater than five\r\na == 5 // Checks to see if a equals five, for good measure \r\nComparing variables isn't really useful until you have some way of using the results--that's what lesson 2, on if statements is all about. \r\n\r\nIf you enjoyed this tutorial, check out the Cprogramming.com ebook, Jumping into C++. It contains all the information in this tutorial, plus much much more, in one convenient place, along with tons of sample code and practice problems. Buy Jumping into C++ today! \r\n");
		JScrollPane jsp=new JScrollPane(txtrCIsA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(20, 57, 446, 300);
		getContentPane().add(jsp);
		//txtrCIsA.setBounds(25, 49, 407, 313);
		//getContentPane().add(txtrCIsA);
		
		hp = new JButton("Back to HomePage");
		hp.setToolTipText("Click for Home Page");
		hp.setForeground(new Color(255, 255, 255));
		hp.setBackground(new Color(255, 140, 0));
		hp.setBounds(100, 373, 149, 23);
		getContentPane().add(hp);
		
		cancel = new JButton("Exit");
		cancel.setToolTipText("Click for Cancel");
		cancel.setForeground(new Color(255, 255, 255));
		cancel.setBackground(new Color(255, 0, 0));
		cancel.setBounds(329, 373, 89, 23);
		getContentPane().add(cancel);
		JLabel label = new JLabel(ii);
		label.setBounds(0, 0, 463,414);
		getContentPane().add(label);
		
		hp.addActionListener(this);
		cancel.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		new cpp();
		// TODO Auto-generated method stub

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
