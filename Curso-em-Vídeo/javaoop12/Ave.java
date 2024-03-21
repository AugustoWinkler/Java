
package javaoop12;


public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando de Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho(){
        System.out.println("Construindo Ninho");
    }
    
}
