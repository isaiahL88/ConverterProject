package view;

import java.text.DecimalFormat;

import javax.swing.*;

	
	/**
	* The class invariant is that there is always a value to convert
	*/
public class FeetConversionArea extends JTextArea implements Observer{
	 /**
	* constructor for JtextArea from DisplayPanel
 	* @param s A string contain preset text in MeterConversionArea
	* @param x A integer to constructs JTextArea with the specified number of rows 
	* @param y A integer to constructs JTextArea with the specified number of columns 
	*/
	public FeetConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
	/**
	* Preconditions: parameter value is a centimeter value. 
  	* Postcondition: parameter value is converted from a centimeter value to a feet value.
  	* 
 	* @param value the value needed to convert to feet
	*/
	public void updateVal(double value) {
		value=value*0.0328084;
		DecimalFormat df = new DecimalFormat("#.####");
		value=Double.parseDouble(df.format(value));
		this.setText(""+value+" ft");
	}
}
