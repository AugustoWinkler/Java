package academy.devdojo.maratonajava.introducao;

public class Aula23DevDojo {

	public static void main(String[] args) {
		double salarioAnual = 45000;
		double impostoSalario;
		
		if(salarioAnual <= 34712) {
			impostoSalario = salarioAnual * 9.70 / 100;
		}else if(salarioAnual > 34712 && salarioAnual < 68507 ) {
			impostoSalario = salarioAnual * 37.35 / 100;
		}else {
			impostoSalario = salarioAnual * 49.50 / 100;
		}
		
		System.out.println("Valor do salário: " + salarioAnual + " imposto: " + impostoSalario + " Total: " + (salarioAnual + impostoSalario));
	}

}
