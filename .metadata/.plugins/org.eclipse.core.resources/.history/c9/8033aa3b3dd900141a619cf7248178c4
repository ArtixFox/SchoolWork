package com.adsb.school.Applets;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Date;

public class Applets4 extends Applet implements ActionListener{
	
	private static final long SerialVersionUID = 1L;

	private Button button1, button2;
	private TextField text1, text2;
	private Date today;
	private TextArea textArea1;
	private Label nameLabel, dateLabel;
	
	public void init(){
		//setting the size of the applet
		setSize(500, 500);
		//init objects
		today = new Date();
		text1 = new TextField(20);
		text2 = new TextField(20);
		textArea1 = new TextArea("Welcome to my applet. This shows my appletmaking skills.", 6, 20);
		button1 = new Button("Name");
		button2 = new Button("Date");
		nameLabel = new Label("Name");
		dateLabel = new Label("Date");
		
		
		
		//adding objects to screen
		
		add(textArea1);
		add(nameLabel);
		add(text1);
		add(button1);
		add(dateLabel);
		add(text2);
		add(button2);
		//listeners
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String name = "Hayden J.";
		String date = (today.getMonth()+1) + "/" + (today.getDay()-2) + "/" + (today.getYear()+1900);
		
		
		if(e.getSource() ==button1){
			text1.setText(name);
		}
		if(e.getSource() == button2){		
			text2.setText(date);
		}
	}
		
}


