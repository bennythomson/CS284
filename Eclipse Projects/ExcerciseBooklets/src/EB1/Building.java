package EB1;

public class Building implements Measurable {
	//Data fields
	public double height;
	
	Building(double height) {
		this.height = height;
	}

	public double measure() {
		return this.height;
	}
}
