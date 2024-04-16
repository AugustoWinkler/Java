package BroCode;

public class overloadedConstructor {

	public static void main(String[] args) {
		// overloaded constructor = multilple constructor within a class with the same name.
		//							but have differents parameters
		//							name + parameters =  signature
		
		
		Pizza pizza = new Pizza("Thicc crust","tomato","mozzarella");
		
		System.out.println("This are the ingredients of our pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.cheese);
		System.out.println(pizza.sauce);
		System.out.println(pizza.topping);
		
		
		

	}
	
	public static class Pizza{
		
		String bread;
		String sauce;
		String cheese;
		String topping;
		
		Pizza(String bread, String sauce, String cheese, String topping){
			this.bread = bread;
			this.sauce = sauce;
			this.cheese = cheese;
			this.topping = topping;
		}
		Pizza(String bread, String sauce, String cheese){
			this.bread = bread;
			this.sauce = sauce;
			this.cheese = cheese;
			
		}
		Pizza(String bread, String sauce){
			this.bread = bread;
			this.sauce = sauce;

		}
		Pizza(String bread){
			this.bread = bread;

		}
	}

}
