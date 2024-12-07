package academy.devdojo.maratonajava.introducao;

/*
 * Crie variáveis para os campos descritos abaixo entre <> 
 * e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço>, confirmo que 
 * recebi o salário de <salario>, na data <data>
 */

public class Aula03DevDojo {

	public static void main(String[] args) {
		String nome = "Augusto";
		String endereco = "R. Ficticia, 127";
		double salario = 1700.0;
		String dataRecebimentoSalario = "12/12/2022";
		
		
		System.out.println(String.format("Eu %s, morando no endereço: %s, confirmo que recebi o salário de: %.2f, na data %s", nome, endereco, salario, dataRecebimentoSalario));

	}

}
