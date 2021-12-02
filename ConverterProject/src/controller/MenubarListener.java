package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CentimetersConversionArea;
import javax.swing.JOptionPane;

import model.ValueToConvert;

public class MenubarListener implements ActionListener{
	
	private CentimetersConversionArea c;
	private ValueToConvert v;
	public MenubarListener() {
	}
	public void setReciever(CentimetersConversionArea r) {
		c=r;
	}
	public void setVTC(ValueToConvert r) {
		v=r;
	}
	//@Override
	/*
	* Preconditions: 
  	* Postconditions: retrieves value specified by the user in the CentimetersConversionArea JTextArea and sets the new state of ValueToConvert with it
	* @throws NumberFormatException if it is not possible to convert the string 'value' into a double 
	*/
	public void actionPerformed(ActionEvent e) {
		String value = c.getValue();
		
		try {
			double centimetes = Double.parseDouble(value);
		} catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "please enter a number", "error", JOptionPane.INFORMATION_MESSAGE);
		}
		double centimetes = Double.parseDouble(value);
		v.setValue(centimetes);
	}
}
