package com.adsb.school.Applets;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Applets5A extends Applet implements ActionListener {

	private static final long serialVersionUID = 1L;
	
//+
	TextField txt1;
	TextField txt2;
	TextField txt3;
	Button button1;
	Label label1;
//-
	TextField txt4;
	TextField txt5;
	TextField txt6;
	Button button2;
	Label label2;
	
//*
	TextField txt7;
	TextField txt8;
	TextField txt9;
	Button button3;
	Label label3;
	
// '/'
	TextField txt10;
	TextField txt11;
	TextField txt12;
	Button button4;
	Label label4;
	
	public void init(){
		
		setLayout(new GridLayout(4,5));
		//initilazing
		txt1 =new TextField(3);
		txt2 =new TextField(3);
		txt3 =new TextField(3);
		txt4 =new TextField(3);
		txt5 =new TextField(3);
		txt6 =new TextField(3);
		txt7 =new TextField(3);
		txt8 =new TextField(3);
		txt9 =new TextField(3);
		txt10 =new TextField(3);
		txt11=new TextField(3);
		txt12 =new TextField(3);
		button1 = new Button("=");
		button2 = new Button("=");
		button3 = new Button("=");
		button4 = new Button("=");
		label1 = new Label("+");
		label2 = new Label("-");
		label3 = new Label("*");
		label4 = new Label("/");
		//adding to pannel
		add(txt1);
		add(label1);
		add(txt2);
		add(button1);
		add(txt3);
		
		add(txt4);
		add(label2);
		add(txt5);
		add(button2);
		add(txt6);
		
		add(txt7);
		add(label3);
		add(txt8);
		add(button3);
		add(txt9);
		
		add(txt10);
		add(label4);
		add(txt11);
		add(button4);
		add(txt12);
		
		//add listeners
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		//adding
		if (e.getSource() == button1){
			int sum = Integer.parseInt(txt1.getText())+
					Integer.parseInt(txt2.getText()); txt3.setText(String.valueOf(sum));
			
		}
		if(e.getSource() == button2){
			int sum = Integer.parseInt(txt4.getText())-
					Integer.parseInt(txt5.getText()); txt6.setText(String.valueOf(sum));
		}
		if(e.getSource() == button3){
			int sum = Integer.parseInt(txt7.getText())*
					Integer.parseInt(txt8.getText()); txt9.setText(String.valueOf(sum));	
		}
		if(e.getSource() == button4){
			int sum = Integer.parseInt(txt10.getText())/
					Integer.parseInt(txt11.getText());txt12.setText(String.valueOf(sum));
			
		}
		
	}
	
}
