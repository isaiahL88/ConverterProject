package view;

import java.text.DecimalFormat;

import javax.swing.*;

public class MeterConversionArea extends JTextArea implements Observer{
	
	public MeterConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
        /*
	* Preconditions: parameter value is a centimeter value
  	* Postconditions: parameter value is converted from a centimeter value to a meter value 
 	* @param value the value needed to convert to meters
	*/
	public void updateVal(double value) {
		
		value=value*0.01;
		DecimalFormat df = new DecimalFormat("#.####");
		value=Double.parseDouble(df.format(value));
		this.setText(""+value+" m");
	}
}
