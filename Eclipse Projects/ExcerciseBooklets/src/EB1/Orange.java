package EB1;

public class Orange implements Measurable {
	
	private double weight;
	
	Orange(double weight) {
		this.weight = weight;
	}
	
	public double measure() {
		return this.weight;
	}
	
}
