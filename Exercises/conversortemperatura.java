
public class conversortemperatura {
	public static void main(String[] args) {
		
		double fahrenheit, kelvin, reaumur, rankine;
		
		float temperatura = 10;
		System.out.print(temperatura);
		fahrenheit = temperatura * 1.8 + 32;
		kelvin = temperatura + 273.15;
		reaumur = temperatura * 0.8;
		rankine = temperatura * 1.8 + 32 + 459.67;
		
		 System.out.printf("Temperatura em Celsius: %.2f°C%n", temperatura);
	     System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
	     System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
	     System.out.printf("Temperatura em Réaumur: %.2f°Re%n", reaumur);
	     System.out.printf("Temperatura em Rankine: %.2f°R%n", rankine);
	    
	}
}
