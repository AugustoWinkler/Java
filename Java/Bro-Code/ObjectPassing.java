package BroCode;

public class ObjectPassing {

	public static void main(String[] args) {
		
		Garage garage =  new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		garage.park(car1);
		garage.park(car2);
		

	}
	public static class Garage{
		Car car;
		
		void park(Car car) {
			System.out.println("The car: " + car.name + " Is parked in the garage");
		}
		
	}
	public static class Car{
		String name;
		
		Car(String name){
			this.name = name;
		}
		
	}

}
