package academy.devdojo.maratonajava.introducao;


import java.util.Scanner;

public class Aula69DevDojo {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Grande software");
		System.out.println("Digite uma pergunta e eu direi sim ou não");
		String pergunta = t.nextLine();
		
		if(pergunta.charAt(0) == ' ') {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		
		

	}

}
