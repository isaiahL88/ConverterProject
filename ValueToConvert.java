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
	
	public void CmToFeet() {
		double valueinfeet = value /2.54;
		System.out.println("@@@@@NEW VALUE IN feet: " + valueinfeet);
	}
	
	public void CmToMeter() {
		double valueinmeter = value /100;
		System.out.println("@@@@@NEW VALUE IN meter: " + valueinmeter);
	}
}
