package EB1;

public class Person {
	
	private String name;
	private int age;
	private String address;
	
	/**
	 * creates a new Person
	 */
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	/**
	 * Return's the person's name 
	 * @return name
	 */
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Name: " + this.getName() + ". Age: " + this.getAge() + ". Address: " + this.getAddress();
	}


	public static void main(String[] args) {
		
	}

}
