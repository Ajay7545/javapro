package ProjectJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;

public class html extends JDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton hp;
	private JButton cancel;
	private JEditorPane dtrpnWhatIsHtml;


	public html() 
	{
		ImageIcon ii= new ImageIcon(getClass().getResource("img/pp.jpg"));
		
		setSize(487,466);
		getContentPane().setLayout(null);
		
		JLabel lblHtml = new JLabel("HTML");
		lblHtml.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 45));
		lblHtml.setForeground(Color.ORANGE);
		lblHtml.setBounds(140, 11, 183, 37);
		getContentPane().add(lblHtml);
		
		hp = new JButton("Back to HomePage");
		hp.setBackground(Color.ORANGE);
		hp.setBounds(140, 396, 153, 23);
		getContentPane().add(hp);
		
		cancel = new JButton("Exit");
		cancel.setForeground(new Color(192, 192, 192));
		cancel.setBackground(Color.RED);
		cancel.setBounds(336, 396, 89, 23);
		getContentPane().add(cancel);
		
		dtrpnWhatIsHtml = new JEditorPane();
		dtrpnWhatIsHtml.setText("What is HTML?\r\nHTML is the standard markup language for creating Web pages.\r\n\u2022\tHTML stands for Hyper Text Markup Language\r\n\u2022\tHTML describes the structure of Web pages using markup\r\n\u2022\tHTML elements are the building blocks of HTML pages\r\n\u2022\tHTML elements are represented by tags\r\n\u2022\tHTML tags label pieces of content such as \"heading\", \"paragraph\", \"table\", and so on\r\n\u2022\tBrowsers do not display the HTML tags, but use them to render the content of the page\r\n________________________________________\r\nA Simple HTML Document\r\n\r\n\r\nBe sure to check out our HTML attributes section, too.\r\n\u2022\t \r\n<video> HTML Tag\r\nThe <video> element, which adds native video playback support to the HTML specification in HTML5, can be used to embed a video in an HTML document. Add the video URL to the element by using either the src attribute of the <video> element or by nesting one or more <source> elements between the opening and closing <video> tags.\r\n\u2022\t \r\n<track> HTML Tag\r\nThe <track> element is used as a child of an <audio> or <video> element and adds a time-based data source to the parent media element. For example, the <track> element can be used to add timed subtitles to a video and closed captions to audio content.\r\n\u2022\t \r\n<time> HTML Tag\r\nDefines a datetime. The content of a time element is typically a human-readable date and time, and a machine-readable version of the same time is placed in the datetime attribute.\r\n\u2022\t \r\n<tfoot> HTML Tag\r\nThe <tfoot> element identifies one or more <tr> elements as containing summary contents of a table's columns. The <tfoot> element must be the direct descendant of a <table> element. In HTML5, <tfoot> can be placed either before or after <tbody> and <tr> elements, but must appear after any <caption>, <colgroup>, and <thead> elements.\r\n\u2022\t \r\n<tbody> HTML Tag\r\nThe <tbody> element must be a direct descendant of a <table> element and is used to identify <tr> elements that comprise the body of the table. The <tbody> element should always come after a <thead> element and may come before or after a <tfoot> element.\r\n\u2022\t \r\n<summary> HTML Tag\r\nThe <summary> element is used as a child of <details> element to provide a summary of the contents of the <details> element. At this time, <summary> is not well supported across browsers.\r\n\u2022\t \r\n<source> HTML Tag\r\nThe <source> element is used as a child of a <picture>, <audio>, or <video> element, and identifies the URL of one or more media resources. The <source> element is commonly used to add media resources in multiple formats for the best possible cross-browser compatibility.\r\n\u2022\t \r\n<section> HTML Tag\r\nThe <section> element is a structural HTML element used to group together related elements. Each <section> typically includes one or more heading elements and additional elements presenting related content.\r\n\u2022\t \r\n<ruby> HTML Tag\r\nThe <ruby> element is used pair characters of certain Asian languages with pronunciation information. The <ruby> element is used in conjunction with the <rp> and <rt> elements.\r\n\u2022\t \r\n<rt> HTML Tag\r\nDefines explanations and pronunciations of characters in ruby language annotations (a system for displaying certain characters in several Asian languages).\r\n");
		JScrollPane jsp= new JScrollPane(dtrpnWhatIsHtml,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(20, 57, 446, 300);
		add(jsp);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(427, 56, 17, 326);
		getContentPane().add(scrollBar);
		//dtrpnWhatIsHtml.setBounds(21, 56, 423, 326);		
		//getContentPane().add(dtrpnWhatIsHtml);
		JLabel label = new JLabel(ii);
		label.setBounds(0, 0, 471,430);
		getContentPane().add(label);
		
		hp.addActionListener(this);
		cancel.addActionListener(this);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new html();
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
