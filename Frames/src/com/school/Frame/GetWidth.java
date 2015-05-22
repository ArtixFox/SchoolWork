package com.school.Frame;

import java.awt.Toolkit;

public class GetWidth {

	static double WIDTH;
	public static void main(String[] args){
	
	}
	public static double getWidth(){
	
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		WIDTH= screenSize.getWidth();
		
		
		System.out.println(WIDTH + " " +HEIGHT);
		
		return WIDTH;
	}
}
