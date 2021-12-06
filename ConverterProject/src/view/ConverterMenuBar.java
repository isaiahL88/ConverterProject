package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * ConverterMenuBar is used as the Invoker in the command pattern and instantiates the
 * menu bar of the interface, inheriting properties from the JMenuBar. It constructs
 * a bar at the top of the interface and will receive a signal with button clicked 
 * or shortcut key pressed and invoke a command to act on CentimetersConversionArea and ValueToConver.
 *
 */
public class ConverterMenuBar extends JMenuBar {
	
	/**
	 * Instantiantes Menu and MenuItems Inside this JMenuBar, also invokes command menuBarListener
	 * @param menubarListener
	 */
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
