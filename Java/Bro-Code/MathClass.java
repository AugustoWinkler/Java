package BroCode;

public class MathClass {
	public static void main(String[] args) {
		double x = 3.14;
		double y = 10;
		
		//double z = Math.max(x, y); //Max value
		//double z = Math.abs(y); //Absolute value
		//double z = Math.sqrt(y); //Squareroot
		//double z = Math.round(x); //Round the number ex; 3.14 = 3.0 also have floor = 3.0 and ceil = 4.0
		double z = Math.pow(y, 4); //Power
		
		System.out.println(z);
	}
}
