package com.adsb.school.Applets;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class Applets5B extends Applet implements ActionListener{

	private static final long serialVersionUID = 1L;

	Label north, theDate;
	TextField txt1,txt2,txt3,txt4,txt5,txt6;
	TextArea area1;
	Button button1;
	Panel p1,p2,p3,p4,p5;
	Date today;

	
	public void init(){
	
		//String dateMessage = (Calendar.MONTH+1)+ "/" +Calendar.DAY_OF_MONTH+"/"+(Calendar.YEAR);
		setSize(1080,720);
		setLayout(new BorderLayout());
		
		p1 = new Panel();//north
		p2 = new Panel();//west
		p3 = new Panel();//center
		p4 = new Panel();//east
		p5 = new Panel();//south
		north = new Label("this program will be used to find the roots" +
		"and calculate a quadratic equation inputed by the user.");
		
		
		theDate = new Label("Todays Date: The calendar classes arenot working");
		
		txt1= new TextField(5);
		txt2 = new TextField(5);
		txt3 = new TextField(5);
		txt4 = new TextField(7);
		txt5 = new TextField(7);
		txt6 = new TextField(15);
		area1 = new TextArea("y=(-b�Sqrt(b�-4ac)/2");
		button1 = new Button("Calculate!");
		
		p1.add(north);
		p2.add(txt1);
		p2.add(txt2);
		p2.add(txt3);
		p3.add(txt4);
		p3.add(txt5);
		p3.add(txt6);
		p4.add(area1);
		p5.add(button1);
		p5.add(theDate);
		add("North", p1);
		add("West", p2);
		add("Center", p3);
		add("East", p4);
		add("South", p5);
		
		button1.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1){
			double a = Double.parseDouble(txt1.getText());
			double b = Double.parseDouble(txt2.getText());
			double c = Double.parseDouble(txt3.getText());
			area1.setText("y=(-b�Sqrt(b�-4ac)/2"+"\n"+"y=(-("+b+")�Sqrt[("+b+")�-4("+
			a+")("+c+"]/2");
			
			if(Math.pow(b, 2)-4*a*c == 0){
				txt6.setText("there is 1 root.");
				double rt1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/2);
				txt4.setText(String.valueOf(rt1));
			}
			else if(Math.pow(b,2)-4*a*c >1){
				txt6.setText("there are 2 roots.");
				double rt1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/2);
				double rt2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/2);
				
				txt4.setText(String.valueOf(rt1));
				txt5.setText(String.valueOf(rt2));
			}
			else if(Math.pow(b,2)-4*a*c <0){
				txt6.setText("there are 0 roots.");
			}
		
			
		}
		
	}


	
	
	
	
	
	
}
