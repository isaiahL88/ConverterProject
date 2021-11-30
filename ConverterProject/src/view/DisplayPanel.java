package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.MenubarListener;

public class DisplayPanel extends JPanel {
	public static void main(String[] args) {
		JFrame displayFrame = new JFrame("Mini Soccer");
		DisplayPanel displayPanel = new DisplayPanel();
		MenubarListener menubarListener = new MenubarListener(displayPanel);
		ConverterMenuBar displayMenuBar = new ConverterMenuBar(menubarListener);
		displayFrame.add(displayPanel);
		displayFrame.setJMenuBar(displayMenuBar);

		displayPanel.setLayout(null);
		JTextArea CentimetersConversionArea = new JTextArea("0", 20, 20);
		Color colorCentimeters = new Color(255, 255, 0);
		CentimetersConversionArea.setBackground(colorCentimeters);
		CentimetersConversionArea.setBounds(290, 310, 300, 300);
		CentimetersConversionArea.setLineWrap(true);
		displayPanel.add(CentimetersConversionArea);

		JTextArea FeetConversionArea = new JTextArea("0 ft", 20, 20);
		Color colorFeet = new Color(50, 205, 50);
		FeetConversionArea.setBackground(colorFeet);
		FeetConversionArea.setBounds(140, 5, 300, 300);
		FeetConversionArea.setLineWrap(true);
		displayPanel.add(FeetConversionArea);

		JTextArea MeterConversionArea = new JTextArea("0 m", 20, 20);
		Color colorMeter = new Color(255, 165, 0);
		MeterConversionArea.setBackground(colorMeter);
		MeterConversionArea.setBounds(445, 5, 300, 300);
		MeterConversionArea.setLineWrap(true);
		displayPanel.add(MeterConversionArea);

		displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayFrame.setSize(900, 900);
		displayFrame.setLocationRelativeTo(null);
		displayFrame.setResizable(false);
		displayFrame.setVisible(true);

	}

}
