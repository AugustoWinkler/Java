package BroCode;

public class StringMethods {

	public static void main(String[] args) {
	
		String name = "Augusto";
		//boolean result = name.equalsIgnoreCase("Augusto"); //Return Boolean value
		//int result = name.length(); //Return a value of lenght of variable
		//char result =  name.charAt(0); //Return character of index
		//int result = name.indexOf("g"); //find a character and return index
		//boolean result = name.isEmpty(); //Return a boolean value if name is empty true
		//String result = name.toUpperCase(); //Change all character of variable to Uppercase
		//String result = name.trim(); //Remove all empty spaces
		String result = name.replace("u", "e"); //replace "u" to "e"
		System.out.println(result);

	}

}
