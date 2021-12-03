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
		notifyObserver();
	}
	//mutator for observer: attach detach notify
	//Adds an observer to the ArrayList of observers for this object
	public void addObserver(Observer o) {
		listOfObservers.add(o);
	}
	
	//remove an observer to the ArrayList of observers for this object
	public void removeObserver(Observer o) {
		listOfObservers.remove(o);
	}
	
	//update value to all observer in the list
	//Each observer has its update method called
	//precondition: value is changed and this method is getting called
	//postcondition: all observer in the ArrayList is updated
	public void notifyObserver() {
		for (Observer o: listOfObservers)
			o.updateVal(value);
//		this.displayPanel.FCA.updateVal(value);
//		this.displayPanel.MCA.updateVal(value);
	}
	
}
