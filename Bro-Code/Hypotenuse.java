package BroCode;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		
		double x,y,z;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side X: ");
		x = scanner.nextDouble();
		System.out.println("Enter side Y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) ;
		
		System.out.println("The hipotenuse is : " + z);
		
		scanner.close();
		
	}

}
