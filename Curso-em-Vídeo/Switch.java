package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        System.out.println("Quantas Pernas o Bicho tem?");
        int pernas = t.nextInt();
        String tipo;
        
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Biped";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
                    
        }
        
        System.out.println("O Tipoe é: " + tipo);
       
    }
    
}
