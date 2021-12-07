package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import controller.MenubarListener;
import model.ValueToConvert;
import view.ConverterMenuBar;
import view.DisplayPanel;

/** 
* ConverterApp is the main application class which initializes the Model, View, and Controller of the system. 
* This class also connects these three parts to form the application.
*/
public class ConverterApp {
	/** 
	* Main method of system to initialize and connect model, view, and controller of the system
	* 
	* @param args The command line arguments.
	*/
	public static void main(String[] args) {

		ValueToConvert model = new ValueToConvert();
		MenubarListener controller = new MenubarListener();
		DisplayPanel mainPanel = new DisplayPanel(model, controller);

	}

}
