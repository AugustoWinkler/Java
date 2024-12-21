package devDojo;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	
	
	
	public void imprime() {
		System.out.println("--------------");
		System.out.println("Professor: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		if(this.seminarios == null) {
			System.out.println("Não tem seminários cadastrado");
		}else {
			for(Seminario seminario: this.seminarios) {
				System.out.println("Local: " + seminario.getLocal().getEndereco());
				System.out.println("Titulo: " + seminario.getTitulo());
				if(seminario.getAlunos() == null) return;
				for(Aluno alunos: seminario.getAlunos()) {
					System.out.println(alunos.getNome());
				}
			}
		}
	}
	
	
	
	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;

	}

	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}



	
	//getters and setters
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}



	public Seminario[] getSeminarios() {
		return seminarios;
	}



	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
	
	
	
}
