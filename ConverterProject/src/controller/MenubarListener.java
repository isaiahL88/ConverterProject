package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DisplayPanel;

public class MenubarListener implements ActionListener{
	
	private final DisplayPanel displayPanel;

	public MenubarListener(DisplayPanel panel) {
		displayPanel = panel;
	}
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		String value = this.displayPanel.CentimetersConversionArea.getText();
		double centimetes = Double.parseDouble(value);
		this.displayPanel.valueModel.setValue(centimetes);
	}
}
