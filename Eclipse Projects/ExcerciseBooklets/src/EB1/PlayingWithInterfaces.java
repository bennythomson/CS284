
package EB1;

public class PlayingWithInterfaces {

	public static double findMin(Measurable[] mm) {
		double lowest = mm[0].measure();
		for(Measurable obj:mm) {
			if(obj.measure() < lowest) {
				lowest = obj.measure(); 
			}
			
			
		}
		
		return lowest;
	}
	
	public static void main(String[] args) {
		
		Orange o = new Orange(0.3);
		Building b = new Building(1000);
		Orange g = new Orange(0.5);
		
		Measurable[] objs = new Measurable[3];
		objs[0] = o;
		objs[1] = b;
		objs[2] = g;
		
		System.out.println(findMin(objs));
		
		
	}
}


