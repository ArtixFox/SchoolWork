package com.adsb.school.Applets;


import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;

public class Applet1 extends Applet {
	
	private static final long serialVersionUID = -1994206097564841540L;
	
	private String newline = System.getProperty("line.separator");
	
	private String message = "applets are a pain and a blessing i dont mind"+"\n"+
	"having them although the confusion occurs when you have to leave out"+"\n"+
	"statics and mains. These types of classes usually require a"+"\n"+
	"'init' method at least from my experiance. But one question i have is"+"\n"+
	"will we be taking a look at abstract classes and such? Also, my game is"+"\n"+
	"made in an applet, but i am quickly grasping the concept of the applets"+"\n"+
	"as I continue my work on them.";
	
	public void paint(Graphics g){
		
		g.setColor(Color.BLUE);
		g.drawString(message,25, 10);
		
	}
	public void init(){
		
		
	}
	
	
}
