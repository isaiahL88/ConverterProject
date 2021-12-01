package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.MenubarListener;
import model.ValueToConvert;

public class DisplayPanel extends JPanel {
	public JTextArea CentimetersConversionArea;
	public ValueToConvert valueModel;
	
	public DisplayPanel() {
		this.valueModel = new ValueToConvert();
		JFrame displayFrame = new JFrame("Mini Soccer");
		MenubarListener menubarListener = new MenubarListener(this);
		ConverterMenuBar displayMenuBar = new ConverterMenuBar(menubarListener);
		displayFrame.add(this);
		displayFrame.setJMenuBar(displayMenuBar);

		this.setLayout(null);
		this.CentimetersConversionArea = new JTextArea("0", 20, 20);
		Color colorCentimeters = new Color(255, 255, 0);
		CentimetersConversionArea.setBackground(colorCentimeters);
		CentimetersConversionArea.setBounds(290, 310, 300, 300);
		CentimetersConversionArea.setLineWrap(true);
		this.add(CentimetersConversionArea);

		JTextArea FeetConversionArea = new JTextArea("0 ft", 20, 20);
		Color colorFeet = new Color(50, 205, 50);
		FeetConversionArea.setBackground(colorFeet);
		FeetConversionArea.setBounds(140, 5, 300, 300);
		FeetConversionArea.setLineWrap(true);
		this.add(FeetConversionArea);

		JTextArea MeterConversionArea = new JTextArea("0 m", 20, 20);
		Color colorMeter = new Color(255, 165, 0);
		MeterConversionArea.setBackground(colorMeter);
		MeterConversionArea.setBounds(445, 5, 300, 300);
		MeterConversionArea.setLineWrap(true);
		this.add(MeterConversionArea);

		displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayFrame.setSize(900, 900);
		displayFrame.setLocationRelativeTo(null);
		displayFrame.setResizable(false);
		displayFrame.setVisible(true);

	}
	

}
