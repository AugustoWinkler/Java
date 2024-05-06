package BroCode;

public class inheritance {

	public static void main(String[] args) {

				
			Car car = new Car();
				
			car.go();
				
			Bicycle bike = new Bicycle();
				
			car.go();
			bike.stop();
				
			System.out.println(car.door);
			System.out.println(bike.pedals);

	}
	
	public static class Vehicle{
		double speed;

		void go(){
		System.out.println("This vehicle is moving");
		}
		void stop(){
		System.out.println("This vehicle is stopped");
		}
		}
		
		public static class Car extends Vehicle{
		int wheels = 4;
		int door = 4;
		}
		
		public static class Bicycle extends Vehicle{
		int wheels = 2;
		int pedals = 2;
		}

}
