package com.adsb.school.Applets;


import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;


public class Applet1 extends Applet {
	
	private static final long serialVersionUID = -1994206097564841540L;
	
	private String message1 = "applets are a pain and a blessing i dont mind";
	private String  message2 = "having them although the confusion occurs when you have to leave out";
	private String  message3= "statics and mains. These types of classes usually require a";
	private String  message4 = "'init' method at least from my experiance. But one question i have is";
	private String  message5 = "will we be taking a look at abstract classes and such? Also, my game is";
	private String  message6 = "made in an applet, but i am quickly grasping the concept of the applets";
	private String  message7 = "as I continue my work on them.";
	
	public void paint(Graphics g){
		setSize(500, 300);
		g.setColor(Color.BLUE);
		g.drawString(message1,25, 10);
		g.drawString(message2,25, 20);
		g.drawString(message3,25, 30);
		g.drawString(message4,25, 40);
		g.drawString(message5,25, 50);
		g.drawString(message6,25, 60);
		g.drawString(message7,25, 70);
	}
	public void init(){
		
		
	}
	
	
}
