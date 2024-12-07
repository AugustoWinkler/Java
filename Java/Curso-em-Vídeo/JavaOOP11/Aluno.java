
package JavaOOP11;


public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    //Métodos
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada.");
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno: " + this.nome);
    }
    //Getters and Setters

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
