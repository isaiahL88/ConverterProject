package model;

import java.util.ArrayList;
//import java.util.Observer;

//import view.DisplayPanel;
import view.Observer;

/**
* get and encapsulate the value, methods that relate to the Observers
*/

public class ValueToConvert {
	private double value;
	//create list of observers
	private ArrayList<Observer> listOfObservers;
	//private final DisplayPanel displayPanel;

	/**
	* create a Arraylist for Observer to register
	*/
	public ValueToConvert() {
		//displayPanel = panel;
		listOfObservers=new ArrayList<Observer>();
	}
	
	/**
	* get the value of input
	* postcondition: get the value of input from CentimetersConversionArea
	* @return the input value in centimeteresConversionArea
	*/
	public double getValue() {
		return this.value;
	}
	/**
	* update the value of input
	* postcondition: the value encapsulated in is updated and send a 
	* singal to Observer
	* @param value A double number that get from CentimetersConversionArea
	*/
	
	public void setValue(double value) {
		this.value = value;
		notifyObserver();
	}
	//mutator for observer: attach detach notify
	/**
	*Adds an observer to the ArrayList of observers for this object
	*@param o Observer that add into ArrayList
	*/
	
	public void addObserver(Observer o) {
		listOfObservers.add(o);
	}
	/**
	*remove an observer to the ArrayList of observers for this object
	*@param o Observer that remove into ArrayList
	*/
	public void removeObserver(Observer o) {
		listOfObservers.remove(o);
	}
	/**
	*update value to all observer in the list
	*Each observer has its update method called
	*precondition: value is changed and this method is getting called
	*postcondition: all observer in the ArrayList is updated
	*/
	public void notifyObserver() {
		for (Observer o: listOfObservers)
			o.updateVal(value);
//		this.displayPanel.FCA.updateVal(value);
//		this.displayPanel.MCA.updateVal(value);
	}
	
}
