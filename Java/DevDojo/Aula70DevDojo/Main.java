package devDojo;

public class Main {

	public static void main(String[] args) {
		
		//Instanciando 3 locais.
		Local local =  new Local("Rua Ruazinha das Ruas");
		Local local2 =  new Local("Avenida Brasileira");
		Local local3 =  new Local("Estrada americana");
		
	
		
		//Instanciando 3 alunos
		Aluno aluno =  new Aluno("José",21);
		Aluno aluno2 =  new Aluno("Pedro",27);
		Aluno[] alunosSeminario = new Aluno[] {aluno,aluno2};
		Aluno aluno3 =  new Aluno("Maria",27);
		Aluno[] alunosSeminario2 = new Aluno[] {aluno3};
		
		//Istanciando professores
		Professor professor = new Professor("Wagner", "Mestrado em Astronomia");
		Professor professor2 = new Professor("Joana", "Doutorado em Economia");
		Professor professor3 = new Professor("Ricardo", "Bancario");

		//Instaciando 3 Seminarios
		Seminario seminario = new Seminario("Seminario antitabagismo", local, alunosSeminario);
		Seminario seminario2 = new Seminario("Seminario injeção de Sucesso", local2, alunosSeminario2);
		Seminario seminario3 = new Seminario("Seminario Budismo", local3);
		
		Seminario[] seminariosDoProfessorWagner = new Seminario[] {seminario,seminario2};
		Seminario[] seminariosDoProfessorJoana = new Seminario[] {seminario2,seminario3};
		
		professor.setSeminarios(seminariosDoProfessorWagner);
		professor2.setSeminarios(seminariosDoProfessorJoana);
		
		professor.imprime();
		System.out.println("----------------------");
		professor2.imprime();
		System.out.println("----------------------");
		professor3.imprime();
	}

}
