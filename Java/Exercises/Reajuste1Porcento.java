
package reajuste1;

import java.util.Scanner;


public class Reajuste1 {

  
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        float saldo = t.nextFloat();
        float reajuste = saldo + (saldo*1/100);
        System.out.println("Saldo com reajutes: " + reajuste);
    }
    
}
