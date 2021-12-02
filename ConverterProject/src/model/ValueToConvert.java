package model;

import java.util.ArrayList;
//import java.util.Observer;

//import view.DisplayPanel;
import view.Observer;

public class ValueToConvert {
	private double value;
	//create list of observers
	private ArrayList<Observer> listOfObservers;
	//private final DisplayPanel displayPanel;

	public ValueToConvert() {
		//displayPanel = panel;
		listOfObservers=new ArrayList<Observer>();
	}
	public double getValue() {
		return this.value;
	}
	public void setValue(double value) {
		this.value = value;
//		System.out.println("@@@@@NEW VALUE IN MODEL: " + value);
		notifyObserver();
	}
	//mutator for observer: attach detach notify
	public void addObserver(Observer o) {
		listOfObservers.add(o);
	}
	public void removeObserver(Observer o) {
		listOfObservers.remove(o);
	}
	
	public void notifyObserver() {
		for (Observer o: listOfObservers)
			o.updateVal(value);
//		this.displayPanel.FCA.updateVal(value);
//		this.displayPanel.MCA.updateVal(value);
	}
	
}
