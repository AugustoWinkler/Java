
package tabuada;

import java.util.Scanner;

public class Tabuada {

  
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um numero para saber sua Tabuada: ");
        int numero = t.nextInt();
        int contador = 1;
        while(contador<=10){
            System.out.println(numero + " X " + contador + " = " + (numero*contador));
            contador++;
        }
    }
    
}
