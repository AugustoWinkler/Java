
package javaoop08;

import java.util.Random;


public class Luta {
    
    //Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2  ){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            System.out.println("A Luta não pode acontecer.");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada == true){
            Random random = new Random();
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            int vencedor = random.nextInt(3); // 0 1 2
            System.out.println("========== RESULTADO DA LUTA ==========");
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Venceu: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Venceu: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=======================================");
        }
    }
    
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
