package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.MenubarListener;
import model.ValueToConvert;

/** create the vitual interface for converterApp
* create centimeter converstion area set the color and add to reciever
* create feet converstion area set the color and add to observer
* create meter converstion area set the color and add to observer
* set displayFrame.
*/

public class DisplayPanel extends JPanel {
	public CentimetersConversionArea CMA;
	public FeetConversionArea FCA;
	public MeterConversionArea MCA;
	public ValueToConvert valueModel;
	
	public DisplayPanel() {
		this.valueModel = new ValueToConvert();
		JFrame displayFrame = new JFrame("Converter");
		MenubarListener menubarListener = new MenubarListener();
		ConverterMenuBar displayMenuBar = new ConverterMenuBar(menubarListener);
		displayFrame.add(this);
		displayFrame.setJMenuBar(displayMenuBar);

		menubarListener.setVTC(valueModel);
		this.setLayout(null);
		CMA = new CentimetersConversionArea("0", 20, 20);
		Color colorCentimeters = new Color(255, 255, 0);
		CMA.setBackground(colorCentimeters);
		CMA.setBounds(290, 310, 300, 300);
		CMA.setLineWrap(true);
		this.add(CMA);
		menubarListener.setReciever(CMA);
		
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
