package view;

/**
 * Interface for the Observer pattern. This interface represents an observer in this pattern.
 */
public interface Observer {
	/**
	 * This method is to be called by subject of this observer to allow this class to update itself
	 * 
	 * @param value value given by subject
	 */
	public void updateVal(double value);
}
