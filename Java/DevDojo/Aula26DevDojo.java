package academy.devdojo.maratonajava.introducao;

public class Aula26DevDojo {

	public static void main(String[] args) {
		
		int diaSemana = 1;
		
		switch(diaSemana) {
		case 1,7:
			System.out.println("Final de semana");
			break;
		case 2,3,4,5,6:
			System.out.println("Dia útil");
			break;
		default:
			System.out.println("Dia inválido");
		}
		
		
		
	}

}
