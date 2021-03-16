import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Sign In");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300,300);
	    JPanel panel1 = new JPanel();
	    JPanel panel2 = new JPanel();
	    JPanel panel3 = new JPanel();
        JLabel label1 = new JLabel("Username:");
        JLabel label2 = new JLabel("Password:");
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
	    JButton button = new JButton("login");
	    ImageIcon img = new ImageIcon("src/logo.png"); 
	    
	    JLabel thumb = new JLabel();
	    thumb.setIcon(img);
	    
	    panel1.add(thumb);
	    panel2.setLayout(new GridLayout(2,2));
	    panel2.add(label1);
	    panel2.add(tf1);
	    panel2.add(label2); 
        panel2.add(tf2);
        panel3.add(button);
	    
       
        frame.getContentPane().add(BorderLayout.NORTH, panel1);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.getContentPane().add(BorderLayout.SOUTH, panel3);
	    frame.setVisible(true);
	}

}
