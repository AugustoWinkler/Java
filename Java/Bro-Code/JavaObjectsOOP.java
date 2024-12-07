package BroCode;

public class JavaObjectsOOP {

    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        
        myCar1.drive();
        myCar1.brake();
        
        myCar2.make = "Ferrari";
        
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

    }

    public static class Car {

        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "Blue";
        double price = 50000.00;

        void drive() {
            System.out.println("You drive the car.");
        }

        void brake() {
            System.out.println("you step on the brakes");
        }

    }

}
