package view;

import java.text.DecimalFormat;

import javax.swing.*;

public class MeterConversionArea extends JTextArea implements Observer{
	
	public MeterConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
        /*
	* Preconditions:
  	* Postconditions: 
 	* @param 
	*/
	public void updateVal(double value) {
		
		value=value*0.01;
		DecimalFormat df = new DecimalFormat("#.####");
		value=Double.parseDouble(df.format(value));
		this.setText(""+value+" m");
	}
}
