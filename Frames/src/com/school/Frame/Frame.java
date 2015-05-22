package com.school.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class Frame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	static JFrame f;
	
	static Panel p;
	Button button1 = new Button("click");
	static TextField wf, hf;
	//constructor
	public Frame(){
			
		p=new Panel();
		
		wf = new TextField(20);
		hf = new TextField(20);
		
		p.add(wf);
		p.add(hf);
		p.add(button1);
	    button1.addActionListener(this);
		add(p);
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("bunny.jpg"));
		f = new JFrame();
		f.setSize(600,500);
		JFrame.setDefaultLookAndFeelDecorated(true);
		f.setTitle("Frame");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		GetWidth.main(null);
		
	}
	public void actionPerformed(ActionEvent e) {
		String msg = "Hello from java!";
		
		if(e.getSource() == button1){
			wf.setText("WIDTH: " + WIDTH);
			hf.setText("HEIGHT: "+ HEIGHT);
		}
		
	}
}
