package javaoop10;


public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando = true;
    
   //Métodos
    
    public void mudarTrabalho(String trabalho){
        this.setor = trabalho;
    }
    
    //Getters and Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
