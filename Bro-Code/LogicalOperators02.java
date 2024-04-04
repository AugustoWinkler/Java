package BroCode;

import java.util.Scanner;

public class LogicalOperators02 {

	public static void main(String[] args) {
		
		//Logical operators = used to connect two or more expressions
						// 			&& = (AND) both conditions must be true
						// 			|| = (OR) either condition must be true
						// 			! = (NOT) reverses boolean value of codition
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game Press q or Q to quit");
		String response = 	scanner.next();
		
		if (response.equals("q")|| response.equals("Q")) {
			System.out.println("You quit the game");
		}else {
			System.out.println("You're still playing the game");
		}
		
		

	}

}
