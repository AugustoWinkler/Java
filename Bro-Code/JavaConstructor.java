package BroCode;

public class JavaConstructor {

	public static void main(String[] args) {
		// constructor = special method that is called when a object is instantiated (create)
		Human human1 = new Human("Augusto" , 22 , 68);
		Human human2 = new Human("Morty" , 65 , 50);
		
		System.out.println(human2.name);
		human2.eat();
		human1.drink();

	}
	
	
	public static class Human{
		String name;
		int age;
		double weight;
		
		Human(String name, int age, double weight)  /*Constructor*/{
			this.name = name;
			this.age = age;
			this.weight = weight;
			
		}
		
		void eat() {
			System.out.println(this.name + " is eating");
		}
		void drink() {
			System.out.println(this.name + " is drinking *burp*");
		}
		
	}

}
