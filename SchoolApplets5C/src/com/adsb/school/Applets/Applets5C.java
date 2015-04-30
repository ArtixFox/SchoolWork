package com.adsb.school.Applets;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Applets5C extends Applet implements ActionListener, ItemListener{

	private static final long SerialVersionUID = 1L;
	
	Panel p1, p2;
	TextField txt1, txt2, txt3,txt4, txt5;
	Label space;
	Button button1;
	CheckboxGroup radios;
	Checkbox r1, r2, r3, r4;
	
	public void init(){
		
		setSize(1080, 720);
		setLayout(new GridLayout(2, 10));
		
		p1 = new Panel();
		p2 = new Panel();
		txt1 = new TextField(10);
		txt2 = new TextField(10);
		txt3 = new TextField(10);
		txt4 = new TextField(20);
		txt5 = new TextField(20);
		space = new Label("");
		button1 = new Button("Cost?");
		radios = new CheckboxGroup();
		r1 = new Checkbox("1", false, radios);
		r2 = new Checkbox("2", false, radios);
		r3 = new Checkbox("3", false, radios);
		r4 = new Checkbox("4", false, radios);
		
		p1.add(txt1);
		txt1.setText("1. Hamburger: $2.00");
		p2.add(r1);
		r1.addItemListener(this);
		p1.add(txt2);
		txt2.setText("2. Steak: $3.00");
		p2.add(r2);
		r2.addItemListener(this);
		p1.add(txt3);
		txt3.setText("3 Hot Dog: $1.75");
		p2.add(r3);
		r3.addItemListener(this);
		p1.add(space);
		p1.add(txt4);
		txt4.setText("Condiments: $0.25 For each item selected.");
		p2.add(r4);
		r4.addItemListener(this);
		p2.add(button1);
		button1.addActionListener(this);
		p2.add(txt5);
		
		add(p1);
		add(p2);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
	}

	public void itemStateChanged(ItemEvent c) {
		
		
	}
	
	
}
