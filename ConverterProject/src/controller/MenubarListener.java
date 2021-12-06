package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CentimetersConversionArea;
import javax.swing.JOptionPane;

import model.ValueToConvert;

/**
 * MenubarListener is used in the Command pattern as a command. This class will act on receivers 
 * CentimetersConversionArea and ValueToConvert every time it receives an ActionEvent from Invoker(ConverterMenubar).
 */
public class MenubarListener implements ActionListener{
	
	private CentimetersConversionArea c;
	private ValueToConvert v;
	public MenubarListener() {
	}
	
	/**
	* set the reciever to CentimetersConversionArea c instance variable
	* 
	* @param CenimetersConvrsionArea
	*/
	public void setReciever(CentimetersConversionArea r) {
		c=r;
	}
	
	
	/**
	 * sets the ValueToConvert v instance variable
	 * 
	 * @param r
	 */
	public void setRecieverVTC(ValueToConvert r) {
		v=r;
	}
	
	@Override
	/**
	 * This method acts as the execute methord for this command Class, extracting and parsing a string from
	 * instance variable c and storing it as a double value inside instance variable v
	 * 
	 * Preconditions: get signal from the ConverterMenuBar. 
	 * Preconditions: a value is inputted into the CentimetersConversionArea JTextArea. 
  	 * Postconditions: retrieves value specified by the user in the CentimetersConversionArea JTextArea
  	 * and sets the new state of ValueToConvert with it.
  	 * 
	 * @throws NumberFormatException if it is not possible to convert the string 'value' into a double 
	 * @param e represents a semantic event which indicates that a component-defined action occurred
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
