package javaoop13;


public class JavaOOP13 {

    
    public static void main(String[] args) {
        Cachorro y = new Cachorro();
        
        
        y.emitirSom();
        
        //Sobrecarga do método Reagir
        y.reagir("Toma comida");
        y.reagir("Vai apanhar");
        
        y.reagir(11 , 45);
        y.reagir(19,00);
        
        y.reagir(true);
        y.reagir(false);
        
        y.reagir(2 , 12.5f);
        y.reagir(17, 4.5f);
    }
    
}
