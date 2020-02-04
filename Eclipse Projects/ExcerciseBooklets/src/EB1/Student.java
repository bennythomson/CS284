package EB1;

public class Student extends Person {

	private double gpa;
	private int cwid;
	
	public Student(String name, int age, double gpa, int cwid) {
		super(name, age);
		this.setGpa(gpa);
		this.setCwid(cwid);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getCwid() {
		return cwid;
	}

	public void setCwid(int cwid) {
		this.cwid = cwid;
	}
	
}
