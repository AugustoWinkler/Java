package BroCode;

public class IfStatements {

	public static void main(String[] args) {
		//if statement = performs a block of code if it's condition evalutates to be true
		
		int age = 75;
		
		if(age >= 75) {
			System.out.println("Ok boomer!");
		}else if (age >=18){
			System.out.println("You are an adult!");
		}else if(age >=13){
			System.out.println("You are a teenager!");
		}else {
			System.out.println("You are not an adult!");
		}

	}

}
