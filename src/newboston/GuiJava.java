package newboston;
/*import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class GuiJava extends JFrame {
	private JLabel item1;
	
	public GuiJava(){
		super("AMP");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Genesis");
		item1.setToolTipText("amplified bible");
		add(item1);
	}
	
	public static void main(String[] args) {
		GuiJava test = new GuiJava();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setSize(270,180);
		test.setVisible(true);

	}

}*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class GuiJava extends JFrame {
	
	private JTextField items1;
	private JTextField items2;
	private JTextField items3;
	private JPasswordField passwordField;
	
	public GuiJava(){
		super("Title");
		setLayout(new FlowLayout());
		
		items1 = new JTextField(20);
		add(items1);
		
		items2 = new JTextField("enter text here");
		add(items2);
		
		items3 = new JTextField("uneditable", 20);
		items3.setEditable(false);
		add(items3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
//object for the class thehandler ...builds an action listener object
		
		thehandler handler = new thehandler();
		items1.addActionListener(handler);
		items2.addActionListener(handler);
		items3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
		
		
		String string = "";
		if(event.getSource()==items1)
			string=String.format("field 1: %s", event.getActionCommand());
		
		else if(event.getSource()==items2)
			string=String.format("field 2: %s", event.getActionCommand());
		else if(event.getSource()==items3)
			string=String.format("field 3: %s", event.getActionCommand());
		else if(event.getSource()==passwordField)
			string=String.format("field passwordField: %s", event.getActionCommand());
		
		JOptionPane.showMessageDialog(null, string);
		}
	}
	
	public static void main(String[] args) {
		GuiJava test = new GuiJava();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setSize(350,180);
		test.setVisible(true);

	}
	
}

