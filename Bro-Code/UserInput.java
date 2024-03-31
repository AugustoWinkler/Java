package BroCode;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats is your name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine(); //Clean scanner
		System.out.println("Whats is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);

	}

}
