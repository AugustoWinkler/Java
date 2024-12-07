package BroCode;

import java.util.Random;

public class RandomValues {

	public static void main(String[] args) {
		Random random = new Random();
		
		//int x = random.nextInt(6); //Random int number between 0 and 5
		//double x = random.nextDouble(); //Random double number
		boolean x = random.nextBoolean(); //Random true or false
		
		
		System.out.println(x);

	}

}
