package view;
import javax.swing.*;

/** 
* CentimetersConversionArea for displayPanel
*/
public class CentimetersConversionArea extends JTextArea{
	
	/*
	* constructor for JtextArea from DisplayPanel
 	* @param s A string contain preset text in MeterConversionArea
	* @param x A integer to constructs JTextArea with the specified number of rows 
	* @param y A integer to constructs JTextArea with the specified number of columns 
	*/
	public CentimetersConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
	
	/** Gets the text of the input.
 	* @return A string of input in the JTextArea
	*/
	public String getValue() {
		return this.getText();
	}
}
	
	

