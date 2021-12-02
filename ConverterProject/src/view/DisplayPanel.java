package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.MenubarListener;
import model.ValueToConvert;

public class DisplayPanel extends JPanel {
	public JTextArea CentimetersConversionArea;
	public FeetConversionArea FCA;
	public MeterConversionArea MCA;
	public ValueToConvert valueModel;
	
	public DisplayPanel() {
		this.valueModel = new ValueToConvert(this);
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
