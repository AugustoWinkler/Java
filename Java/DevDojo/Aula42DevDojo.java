package academy.devdojo.maratonajava.introducao;



public class Aula42DevDojo {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.ano = 2024;
		carro1.modelo = "Honda";
		carro1.nome = "Clio";
		
		Carro carro2 = new Carro();
		
		carro2.ano = 2025;
		carro2.modelo = "Chevrollet";
		carro2.nome = "Onyx";
		
		System.out.println("Ano: " + carro1.ano + " Modelo: " + carro1.modelo + " Nome: " + carro1.nome);
		System.out.println("Ano: " + carro2.ano + " Modelo: " + carro2.modelo + " Nome: " + carro2.nome);
		
		
		
		
	}
	
	public static class Carro {
		String nome;
		String modelo;
		int ano;
	}
}

