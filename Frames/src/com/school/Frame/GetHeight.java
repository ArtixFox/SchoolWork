package com.school.Frame;

import java.awt.*;
public class GetHeight {

	static double HEIGHT;
	public static void main(String[] args){
		
	}
	
	public static double getHeight(){
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		HEIGHT = screenSize.getHeight();
		return HEIGHT;
	}
	
	
}
