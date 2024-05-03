package BroCode;

import java.util.ArrayList;

public class ArrayListTutorial{

	public static void main(String[] args) {
		// ArrayList = a resizable array.
		//			   elements can be added and removed after compilation phase
		// 			   store reference data types.
		
		ArrayList<String> food = new ArrayList<String>(); 

		food.add("pizza");
		food.add("hamburguer");
		food.add("hotdog");
		
		food.set(0, "sushi"); //Add a new element in array using index and value
		food.remove(2); //remove a element by index
		food.clear(); //clar array list
		
		
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
