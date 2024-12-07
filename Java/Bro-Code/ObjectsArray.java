package BroCode;

public class ObjectsArray {

	public static void main(String[] args) {
		// Array of Objects
		
		Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburguer");
		Food food3 = new Food("HotDog");
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		
		
		

	}
	public static class Food{
		String name;
		
		Food(String name){
			this.name = name;
		}
		
	}

}
