
package exerciciobanco;


public class ExercicioBanco {
    
    static class Banco{
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

    public Banco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0f;
        this.status = false;
    }

    
    //Getters and Setters
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    
    //Métodos
    
    public void abrirConta(){
        if ("CC".equals(this.tipo)){
            setSaldo(50);
        }else{
            setSaldo(150);
        }
        this.status = true;
    }
    public void fecharConta(){
        if (0 == this.saldo){
            this.status = false;
        } else {
            this. status = true;
        }
    }
    public void depositar(float valor){
        this.saldo += valor;
    }
    public void sacar(float valor){
        if ((this.saldo - valor)>=0){
            this.saldo -= valor;
        }
    }
    public void pagarMensal(){
        if(this.tipo == "CC"){
            this.saldo -=12;
        }else{
            this.saldo -=12;
        }
    }
    
    public void estadoAtual(){
        System.out.println("Estado da Conta.");
        System.out.println("Num Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + (this.status ? "Aberta" : "Fechada"));
    }
}
    
    
    //Classe Principal.
    public static void main(String[] args) {
        Banco b1 = new Banco(1111,"CC","Augusto");
        b1.abrirConta();
        b1.pagarMensal();
        b1.depositar((float) 500.50);
        b1.sacar((float) 538.5);
        b1.fecharConta();
        b1.estadoAtual();
        
        Banco b2 =  new Banco(2222,"CP","Rich");
        b2.abrirConta();
        b2.estadoAtual();
    }
    
}
