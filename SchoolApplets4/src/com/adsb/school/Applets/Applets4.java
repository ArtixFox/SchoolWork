package com.adsb.school.Applets;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Date;

public class Applets4 extends Applet implements ActionListener{
	
	private static final long SerialVersionUID = 1L;

	
	private Button button1, button2;
	private TextField text1, text2;
	private Date today;
	private TextArea textArea1;
	private Label nameLabel, dateLabel;
	
	public void init(){
	
		setSize(500, 500);
		
		today = new Date();
		text1 = new TextField(20);
		text2 = new TextField(20);
		textArea1 = new TextArea("Welcome to my applet. This shows my appletmaking skills.", 6, 20);
		add(textArea1);
		
	}
	
	public void actionPerformed(ActionEvent e){
		String name = "Hayden J.";
		String date = (today.getMonth+1) + "/" + today.getDay()
		
		
	}

}
