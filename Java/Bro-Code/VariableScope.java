package BroCode;

import java.util.Random;

public class VariableScope {

	public static void main(String[] args) {
		/* local = declared inside a method
		 * 		   visible only to that method
		 * 
		 * global = declared outside a method, but within a class
		 * 			visible to all parts of a class
		 */
		
		diceRoller diceRoller = new diceRoller();
		
		
		
	}
	
	public static class diceRoller{
		Random random;
		int number;
		
		diceRoller(){
			random =  new Random();
			roll();
		}
		void roll() {
			number = random.nextInt(6)+1;
			System.out.println(number);
		}
	}

}
