package model;

public class ValueToConvert {
	private double value;
	
	public void setValue(double value) {
		this.value = value;
		System.out.println("@@@@@NEW VALUE IN MODEL: " + value);
	}
	
	public double getValue() {
		return this.value;
	}
}
