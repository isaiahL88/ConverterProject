package view;

import java.text.DecimalFormat;

import javax.swing.*;
	
/**
 * This class acts as part of the observer pattern as an observer. This class Observes the
 * ValueToConvert class and displays the value from this subject converted meters.
 *
 */
public class MeterConversionArea extends JTextArea implements Observer{

    /**
	* constructor for JtextArea from DisplayPanel
 	* @param s A string contain preset text in MeterConversionArea
	* @param x A integer to constructs JTextArea with the specified number of rows 
	* @param y A integer to constructs JTextArea with the specified number of columns 
	*/
	
	public MeterConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
     
	
	@Override
	/**
	 * This method is to be called by subject of this observer to allow this class to update itself. 
	 * 
	 * Precondition: parameter value is a centimeter value. 
  	 * Postcondition: parameter value is converted from a centimeter value to a meter value. 
 	 * @param value the value needed to convert to meters
	 */
	public void updateVal(double value) {
		
		value=value*0.01;
		DecimalFormat df = new DecimalFormat("#.####");
		value=Double.parseDouble(df.format(value));
		this.setText(""+value+" m");
	}
}
