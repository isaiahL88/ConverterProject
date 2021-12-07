package model;

import java.util.ArrayList;
//import java.util.Observer;

//import view.DisplayPanel;
import view.Observer;

/**
 *The ValueToConvert class is the model of the system that holds the inputed value in centimeters.
 *It includes all the methods to the observers including add, remove and notify observer. 
 *It is used in the Observer pattern as a subject and also used in the command pattern as a receiver. 
 *
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
	* get the value of input. 
	* 
	* @return the input value in centimeteresConversionArea
	*/
	public double getValue() {
		return this.value;
	}
	
	/**
	* update the value of input. 
	* Postcondition: the value encapsulated in is updated and the observers of
	* this class are notified.
	* @param value A double number that get from CentimetersConversionArea
	*/
	public void setValue(double value) {
		this.value = value;
		notifyObserver();
	}

	/**
	*Adds an observer to the ArrayList of observers for this object
	*@param o Observer that add into ArrayList
	*/
	public void addObserver(Observer o) {
		listOfObservers.add(o);
	}
	/**
	*remove an observer to the ArrayList of observers for this object
	*@param o Observer that remove from ArrayList
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
	}
	
}
