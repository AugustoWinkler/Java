package academy.devdojo.maratonajava.introducao;



public class Aula53DevDojo {

	public static void main(String[] args) {
			
		Funcionario funcionario1 = new Funcionario();

		funcionario1.nome = "Augusto";
		funcionario1.idade = 23;
		funcionario1.salario = new double[] {1500,1900,2500};
		
		
		funcionario1.imprime();
		funcionario1.mediaSalario();	
		
		
		

	}
	
	
}
class Funcionario{
	public String nome;
	public int idade;
	public double[] salario = new double[3];
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		for(double salario: this.salario) {
			System.out.print(salario + " ");
		}
		System.out.println();
		
	}
	
	 public void mediaSalario() {
	        double total = 0; 
	        for (double salario : this.salario) {
	            total += salario;
	        }
	        double media = total / this.salario.length; 
	        System.out.printf("Média Salarial: %.2f\n", media); 
	    }
	
}