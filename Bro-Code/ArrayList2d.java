package BroCode;

import java.util.*;

public class ArrayList2d {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("Tomatos");
		produceList.add("Zucchini");
		produceList.add("Peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("Soda");
		drinksList.add("Coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(2).get(1));

	}

}
