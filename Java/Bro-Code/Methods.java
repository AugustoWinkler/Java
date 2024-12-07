package BroCode;

public class Methods {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Augusto";
		int age = 22;
		
		hello(name , age);
		
	}
	static void hello(String name, int age) {
		System.out.println("Hello " + name + "\nYou are " +  age + " years old");
	}

}
