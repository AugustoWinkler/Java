
package conversordolar;

import java.util.Scanner;


public class ConversorDolar {

    
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        float dolar = (float) 4.98; //09/03/2024
        System.out.println("Digite um valor em Reais..");
        float valor = t.nextFloat();
        System.out.printf("Valor: %.2f R$ equivalem a: %.2f $",valor , (valor/dolar));
        
    }
    
}
