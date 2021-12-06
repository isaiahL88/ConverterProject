package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.MenubarListener;
import model.ValueToConvert;

/** DisplayPanel inherits the properties and functions of java’s JPanel concrete class.
 *  It generates 3 JText areas that represent centimeters, feet and meters each with 
 *  distinct colors. These JText areas are objects of their own respective classes that 
 *  extend the JText class. The FeetConversionArea and MeterConversionArea objects
 *   created are the observers used for the observer design pattern, which update 
 *   and adjust their values accordingly whenever ValueToConvert’s state is changed. 
 *   In addition, it maintains the references to receivers used by MenuBarListener in 
 *   the Command pattern.
*/

public class DisplayPanel extends JPanel {
	/**
	 * Area for Centimeter
	 */
	public CentimetersConversionArea CMA;
	/**
	 * Area for feet
	 */
	public FeetConversionArea FCA;
	/**
	 * Area for meter
	 */
	public MeterConversionArea MCA;
	/**
	 * add methods from ValueModel
	 */
	public ValueToConvert valueModel;
	
	/**
	 * 
	 * @param model
	 */
	public DisplayPanel(ValueToConvert model, MenubarListener controller) {
		this.valueModel = model;
		JFrame displayFrame = new JFrame("Converter");
		ConverterMenuBar displayMenuBar = new ConverterMenuBar(controller);
		displayFrame.add(this);
		displayFrame.setJMenuBar(displayMenuBar);

		controller.setRecieverVTC(valueModel);
		this.setLayout(null);
		CMA = new CentimetersConversionArea("0", 20, 20);
		Color colorCentimeters = new Color(255, 255, 0);
		CMA.setBackground(colorCentimeters);
		CMA.setBounds(290, 310, 300, 300);
		CMA.setLineWrap(true);
		this.add(CMA);
		controller.setReciever(CMA);
		
		FCA = new FeetConversionArea("0 ft", 20, 20);
		Color colorFeet = new Color(50, 205, 50);
		FCA.setBackground(colorFeet);
		FCA.setBounds(140, 5, 300, 300);
		FCA.setLineWrap(true);
		this.add(FCA);
		//add observer
		valueModel.addObserver(FCA);
		MCA = new MeterConversionArea("0 m", 20, 20);
		Color colorMeter = new Color(255, 165, 0);
		MCA.setBackground(colorMeter);
		MCA.setBounds(445, 5, 300, 300);
		MCA.setLineWrap(true);
		this.add(MCA);
		//add observer
		valueModel.addObserver(MCA);

		displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayFrame.setSize(900, 900);
		displayFrame.setLocationRelativeTo(null);
		displayFrame.setResizable(false);
		displayFrame.setVisible(true);

	}
	

}
