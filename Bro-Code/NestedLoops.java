package BroCode;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		// nested loop = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int columns;
		
		String symbol = "";
		
		System.out.println("Enter # of rows");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns");
		columns = scanner.nextInt();
		System.out.println("Enter Symbol to use: ");
		symbol = scanner.next();
		
		for(int i = 1; i<=rows; i++) {
			System.out.println();
			for(int j = 1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		
		
	}

}
