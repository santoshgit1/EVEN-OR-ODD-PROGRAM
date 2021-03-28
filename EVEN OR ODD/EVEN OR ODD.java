package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EVEN_OR_ODD extends JFrame implements ActionListener
{
	EVEN_OR_ODD() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\EVEN_OR_ODD_EVEN_OR_ODD.PNG"));
	   l.setBounds(10, -60, 800, 800); 
	   getContentPane().add(l);
	
	   setSize(580,710);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new EVEN_OR_ODD();
	}
	
}