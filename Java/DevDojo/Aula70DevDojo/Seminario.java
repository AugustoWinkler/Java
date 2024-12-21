package devDojo;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Local local;
	

	
	public Seminario(String titulo, Local local) {
		this.local = local;
		this.titulo = titulo;
	}
	public Seminario(String titulo,  Local local , Aluno[] alunos) {
		super();
		this.titulo = titulo;
		this.alunos = alunos;
		this.local = local;
	}
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
}
