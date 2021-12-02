package view;
import javax.swing.*;
public class CentimetersConversionArea extends JTextArea{
	public CentimetersConversionArea(String s, int x, int y) {
		super(s,x,y);
	}
	
	public String getValue() {
		return this.getText();
	}
}
	
	

