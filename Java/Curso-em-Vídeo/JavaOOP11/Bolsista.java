
package JavaOOP11;


public class Bolsista extends Aluno {
    private float bolsa;
    
    //Métodos
    
    public void renovarBolsa(){
        System.out.println("Renovando bolse do: " + this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome  + " é Bolsista! Pagamento facilitado.");
    }
    
    //Getters and Setter

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
