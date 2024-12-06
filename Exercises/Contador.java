import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner  t = new Scanner(System.in);
		System.out.println("Vamos contar apartir de: ");
		int comeco = t.nextInt();
		System.out.println("Até: ");
		int fim = t.nextInt();
		
		while (comeco<fim) {
			comeco++;
			System.out.println(comeco);
			
		}
	}

}
