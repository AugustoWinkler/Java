package devDojo;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public Aluno(String nome, int idade, Seminario seminario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.seminario = seminario;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	
}
