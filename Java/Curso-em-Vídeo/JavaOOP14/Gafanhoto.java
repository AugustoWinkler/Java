
package javaoop14;


public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Getters and Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
    //Métodos
    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    public void ganharExp() {
        this.experiencia ++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" 
                + "login=" 
                + login 
                + ", totAssistido=" 
                + totAssistido 
                + super.toString()
                +'}';
    }
    
    
}
