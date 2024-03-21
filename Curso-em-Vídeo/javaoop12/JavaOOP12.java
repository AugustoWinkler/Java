
package javaoop12;


public class JavaOOP12 {

   
    public static void main(String[] args) {
        //Animal n = new Animal(); //Animal its Abstract and can't be used as object
        Mamifero m = new Mamifero();
        Reptil r =  new Reptil();
        Peixe p = new Peixe();
        Ave a =  new Ave();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        a.locomover();
    }
    
}
