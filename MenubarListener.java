package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DisplayPanel;
import javax.swing.JOptionPane;

public class MenubarListener implements ActionListener{
	
	private final DisplayPanel displayPanel;

	public MenubarListener(DisplayPanel panel) {
		displayPanel = panel;
	}
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		String value = this.displayPanel.CentimetersConversionArea.getText();
		
		try {
			double centimetes = Double.parseDouble(value);
		} catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "please enter a number", "error", JOptionPane.INFORMATION_MESSAGE);
		}
		double centimetes = Double.parseDouble(value);
		this.displayPanel.valueModel.setValue(centimetes);
	}
}
