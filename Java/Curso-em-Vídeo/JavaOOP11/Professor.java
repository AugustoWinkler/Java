
package JavaOOP11;


public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    //Método
    
    public void receberAum(float aum){
        this.salario = aum;
    }
    
    //Getters and Setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
