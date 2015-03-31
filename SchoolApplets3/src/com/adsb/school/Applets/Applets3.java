package com.adsb.school.Applets;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


@SuppressWarnings("serial")
public class Applets3 extends Applet implements ActionListener {

	private static final long SerialVersionUID = 1L;
	
	
	private Button button1, button2;
	private TextField text1, text2, dateBox;
	private Date today;
	private Label dateLabel, nameLabel;
	
	public void init(){
		
		setSize(500,500);//setting applet size
		today = new Date();
		dateLabel = new Label("        Today's Date:");
		add(dateLabel);
		dateBox = new TextField(20);
		add(dateBox);
		button2 = new Button("Date");
		add(button2);
		button2.addActionListener(this);
		
		nameLabel = new Label("        My name:");
		add(nameLabel);
		text1 = new TextField(20);
		add(text1);
		button1 = new Button("Name");
		add(button1);
		button1.addActionListener(this);
		
		
		
		
		
		
		
		
		
	}
	public void paint(Graphics g){
		
	}

	public void actionPerformed(ActionEvent e) {
		String msg = new String("Hayden");
		String dateMessage = (today.getMonth()+1)+ "/" +today.getDate()+"/"+(today.getYear()+1900);
			if (e.getSource() == button1){
			text1.setText(msg);
		
			}
			if(e.getSource() == button2){
				dateBox.setText(dateMessage);
			}
			
		
	}
	
	
	
	
	
}
