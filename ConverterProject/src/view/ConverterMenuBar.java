package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class ConverterMenuBar extends JMenuBar {
	public ConverterMenuBar(ActionListener menubarListener) {
		super();
		
		JMenu gameMenu = new JMenu("Update model");
		JMenuItem menuItem = new JMenuItem("Save input centimeters", KeyEvent.VK_F);
		menuItem.setMnemonic(KeyEvent.VK_F);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
		menuItem.addActionListener(menubarListener);
		gameMenu.add(menuItem);
		super.add(gameMenu);
	}



}
