package view;
import javax.swing.*;

/**
 * The CentimetersConversionArea is a class in the view package of the system which 
 * inputs a value into its text area. It is used in the command design pattern as 
 * a receiver that the MenuBarListener command acts on.
 *
 */
public class CentimetersConversionArea extends JTextArea{
	
	/**
	* constructor for regular JTextArea
	* 
 	* @param s A string contain preset text in MeterConversionArea
	* @param x A integer to constructs JTextArea with the specified number of rows 
	* @param y A integer to constructs JTextArea with the specified number of columns 
	*/
	public CentimetersConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
	
	/** Return the text in this JTextArea.
 	* @return A string of input in the JTextArea
	*/
	public String getValue() {
		return this.getText();
	}
}
	
	

