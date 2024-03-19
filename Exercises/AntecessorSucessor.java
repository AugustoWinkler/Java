
package antecessorsucessor;

import java.util.Scanner;


public class AntecessorSucessor {

    public static void main(String[] args) {
        Scanner t =  new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int numero = t.nextInt();
        int antecessor = numero-1;
        int sucessor = numero+1;
        System.out.println("Antecessor: " + antecessor +" Numero: " + numero + " Sucessor: " + sucessor);
    }
    
}
