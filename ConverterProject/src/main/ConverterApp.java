package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import controller.MenubarListener;
import model.ValueToConvert;
import view.ConverterMenuBar;
import view.DisplayPanel;

/** 
* the main client and application class
*/
public class ConverterApp {
	/** 
	* Our main method. to create an App that convert input in centimeter into feet and meter
	* 
	* @param args The command line arguments.
	*/
	public static void main(String[] args) {

		ValueToConvert model = new ValueToConvert();
		MenubarListener controller = new MenubarListener();
		DisplayPanel mainPanel = new DisplayPanel(model, controller);

	}

}
