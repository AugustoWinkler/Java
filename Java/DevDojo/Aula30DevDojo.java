package academy.devdojo.maratonajava.introducao;

//Dado o valor de um carro descubra em quantas x ele pode ser parcelado
//condição valor parcela >= 1000;



public class Aula30DevDojo {

	public static void main(String[] args) {
		
		double carro = 250000;

		
		for(int i = 1; (carro/i) > 1000; i++) {
			double parcela = (carro/i);
			System.out.printf("%s X = %.2f", i,parcela);
		}
		
		
	}

}
