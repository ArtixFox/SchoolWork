package com.adsb.school.Applets;

import java.applet.*;
import java.awt.*;

public class Applets2 extends Applet{

	private static final long serialVersionUID = 1L;
	
	private TextField text1, text2, text3;
	
	
	
	public void init(){
		text1=new TextField(30);//instantiating
		add(text1);
		text1.setText("My applet using text box controls.");
		
		text2 = new TextField(20);
		add(text2);
		text2.setText("Hayden Jackson");
		
		text3 = new TextField();
		add(text3);
		text3.setText("Date: March 27 2015");
	}
	
	public void paint(Graphics g){
		
	}
	
	
	
	
	
	
	
	
}
