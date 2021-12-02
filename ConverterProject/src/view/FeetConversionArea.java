package view;

import java.text.DecimalFormat;

import javax.swing.*;


public class FeetConversionArea extends JTextArea implements Observer{
	public FeetConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
	/*
	* Preconditions: parameter value is a centimeter value
  	* Postconditions: parameter value is converted from a centimeter value to a feet value 
 	* @param value the value needed to convert to feet
	*/
	public void updateVal(double value) {
		value=value*0.0328084;
		DecimalFormat df = new DecimalFormat("#.####");
		value=Double.parseDouble(df.format(value));
		this.setText(""+value+" ft");
	}
}
