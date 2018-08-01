package ProjectJava;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Controls extends JDialog implements ItemListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField gender;
	private JTextField radio;
	private JTextField combo;
	private JTextField check;
	JRadioButton m ,f,hs,ss,gr;
	JCheckBox sl,pl,ea;
	JComboBox<?> city;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Controls() 
	{
		
		getContentPane().setLayout(null);
		
		m = new JRadioButton("Male");
		m.setBounds(6, 27, 109, 23);
		getContentPane().add(m);
		
		f = new JRadioButton("Female");
		f.setBounds(6, 67, 109, 23);
		getContentPane().add(f);
		
		hs = new JRadioButton("Secondary");
		hs.setBounds(6, 156, 109, 23);
		getContentPane().add(hs);
		
		ss = new JRadioButton("Sr. Secondary");
		ss.setBounds(6, 201, 109, 23);
		getContentPane().add(ss);
		
		gr = new JRadioButton("Graduate");
		gr.setBounds(6, 239, 109, 23);
		getContentPane().add(gr);
		
		gender = new JTextField();
		gender.setBounds(121, 28, 249, 20);
		getContentPane().add(gender);
		gender.setColumns(10);
		
		radio = new JTextField();
		radio.setColumns(10);
		radio.setBounds(121, 157, 249, 20);
		getContentPane().add(radio);
		
		sl = new JCheckBox("Sleeping");
		sl.setBounds(6, 286, 97, 23);
		getContentPane().add(sl);
		
		pl = new JCheckBox("Playing");
		pl.setBounds(6, 312, 97, 23);
		getContentPane().add(pl);
		
		ea = new JCheckBox("Eating");
		ea.setBounds(6, 338, 97, 23);
		getContentPane().add(ea);
		
		city = new JComboBox();
		city.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Lucknow", "Delhi", "Noida"}));
		city.setBounds(16, 368, 87, 20);
		getContentPane().add(city);
		
		combo = new JTextField();
		combo.setColumns(10);
		combo.setBounds(121, 368, 249, 20);
		getContentPane().add(combo);
		
		check = new JTextField();
		check.setColumns(10);
		check.setBounds(121, 287, 249, 20);
		getContentPane().add(check);
		setSize(450,450);
		
		
		ButtonGroup bg1=new ButtonGroup();
		ButtonGroup bg2=new ButtonGroup();
		bg1.add(m);
		bg1.add(f);
		bg2.add(hs);
		bg2.add(ss);
		bg2.add(gr);
		hs.addItemListener(this);
		gr.addItemListener(this);
		ss.addItemListener(this);
		sl.addItemListener(this);
		ea.addItemListener(this);
		pl.addItemListener(this);
		m.addItemListener(this);
		f.addItemListener(this);
		city.addItemListener(this);
		setVisible(true);
		
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Controls();
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		Object ob= e.getSource();
		
		
		if(ob==hs)
		{
			radio.setText(hs.getText());
						
		}
		else if(ob==ss)
		{
			radio.setText("Intermediate");
		}
		else if(ob==gr)
		{
			radio.setText("Graduate");
			
		}
		else if(ob==city)
		{
			String st=city.getSelectedItem().toString();
			combo.setText(st);
		}
	
		else if(ob==m)
		{
			gender.setText(m.getText());
		}
		else if(ob==f)
		{
			gender.setText(f.getText());
		}
		
		else if(ob==sl || ob==ea || ob==pl)
		{
			String msg="";
			if(sl.isSelected())
			{msg+="Sleeping";}
			if(pl.isSelected())
			{msg+=" Playing";}
			if(ea.isSelected())
			{msg+=" Eating";}
			check.setText(msg.trim());
		}
	}
}
