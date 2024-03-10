
package calcarea;

import java.util.Scanner;

public class CalcArea {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Calculo de Area de um terreno.");
        int largura,comprimento;
        System.out.println("Largura: ");
        largura = t.nextInt();
        System.out.println("Comprimento: ");
        comprimento = t.nextInt();
        System.out.printf("Largura: %s X Comprimento: %s = Area: %s m2",largura,comprimento,(largura*comprimento));
    }
    
}
